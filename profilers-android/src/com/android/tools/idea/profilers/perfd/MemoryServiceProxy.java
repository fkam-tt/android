/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.tools.idea.profilers.perfd;

import com.android.annotations.Nullable;
import com.android.ddmlib.Client;
import com.android.ddmlib.IDevice;
import com.android.sdklib.AndroidVersion;
import com.android.tools.idea.flags.StudioFlags;
import com.android.tools.idea.profilers.LegacyAllocationTracker;
import com.android.tools.idea.protobuf.ByteString;
import com.android.tools.idea.transport.ServiceProxy;
import com.android.tools.profiler.proto.Memory.AllocatedClass;
import com.android.tools.profiler.proto.Memory.AllocationStack;
import com.android.tools.profiler.proto.Memory.TrackStatus;
import com.android.tools.profiler.proto.MemoryProfiler;
import com.android.tools.profiler.proto.Memory.AllocationsInfo;
import com.android.tools.profiler.proto.MemoryProfiler.ForceGarbageCollectionRequest;
import com.android.tools.profiler.proto.MemoryProfiler.ForceGarbageCollectionResponse;
import com.android.tools.profiler.proto.MemoryProfiler.MemoryRequest;
import com.android.tools.profiler.proto.MemoryProfiler.MemoryStartRequest;
import com.android.tools.profiler.proto.MemoryProfiler.MemoryStopRequest;
import com.android.tools.profiler.proto.MemoryProfiler.TrackAllocationsRequest;
import com.android.tools.profiler.proto.MemoryProfiler.TrackAllocationsResponse;
import com.android.tools.profiler.proto.MemoryServiceGrpc;
import com.intellij.openapi.diagnostic.Logger;
import gnu.trove.TIntObjectHashMap;
import gnu.trove.TLongObjectHashMap;
import io.grpc.ManagedChannel;
import io.grpc.MethodDescriptor;
import io.grpc.ServerCallHandler;
import io.grpc.ServerServiceDefinition;
import io.grpc.stub.ServerCalls;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.function.BiFunction;
import org.jetbrains.annotations.NotNull;

public class MemoryServiceProxy extends ServiceProxy {

  private static Logger getLogger() {
    return Logger.getInstance(MemoryServiceProxy.class);
  }

  @NotNull private Executor myFetchExecutor;
  @NotNull private final MemoryServiceGrpc.MemoryServiceBlockingStub myServiceStub;
  @NotNull private final IDevice myDevice;
  @NotNull private BiFunction<IDevice, Integer, LegacyAllocationTracker> myTrackerSupplier;
  @NotNull private final Map<String, ByteString> myProxyBytesCache;

  private boolean myUseLegacyTracking;
  private final Object myUpdatingDataLock;
  // Per-process cache of legacy allocation tracker, AllocationsInfo and GetAllocationsResponse
  @Nullable private TLongObjectHashMap<LegacyAllocationTracker> myLegacyTrackers;
  @Nullable private TLongObjectHashMap<TLongObjectHashMap<AllocationsInfo>> myTrackingInfos;
  @Nullable private TLongObjectHashMap<AllocationsInfo> myInProgressTrackingInfo;
  @Nullable private TLongObjectHashMap<TLongObjectHashMap<AllocatedClass>> myAllocatedClasses;
  @Nullable private TLongObjectHashMap<TIntObjectHashMap<AllocationStack>> myAllocationStacks;

  public MemoryServiceProxy(@NotNull IDevice device,
                            @NotNull ManagedChannel channel,
                            @NotNull Executor fetchExecutor,
                            @NotNull BiFunction<IDevice, Integer, LegacyAllocationTracker> legacyTrackerSupplier,
                            Map<String, ByteString> proxyBytesCache) {
    super(MemoryServiceGrpc.getServiceDescriptor());

    myServiceStub = MemoryServiceGrpc.newBlockingStub(channel);
    myDevice = device;
    myFetchExecutor = fetchExecutor;
    myTrackerSupplier = legacyTrackerSupplier;
    myProxyBytesCache = proxyBytesCache;
    myUpdatingDataLock = new Object();

    if (!StudioFlags.PROFILER_USE_LIVE_ALLOCATIONS.get() || myDevice.getVersion().getFeatureLevel() < AndroidVersion.VersionCodes.O) {
      myUseLegacyTracking = true;
      myLegacyTrackers = new TLongObjectHashMap<>();
      myTrackingInfos = new TLongObjectHashMap<>();
      myInProgressTrackingInfo = new TLongObjectHashMap<>();
      myAllocatedClasses = new TLongObjectHashMap<>();
      myAllocationStacks = new TLongObjectHashMap<>();
    }
  }

  public void startMonitoringApp(MemoryProfiler.MemoryStartRequest request,
                                 StreamObserver<MemoryProfiler.MemoryStartResponse> responseObserver) {
    if (myUseLegacyTracking && !myLegacyTrackers.contains(request.getSession().getSessionId())) {
      myLegacyTrackers.put(request.getSession().getSessionId(), myTrackerSupplier.apply(myDevice, request.getSession().getPid()));
      myTrackingInfos.put(request.getSession().getSessionId(), new TLongObjectHashMap<>());
      myAllocatedClasses.put(request.getSession().getSessionId(), new TLongObjectHashMap<>());
      myAllocationStacks.put(request.getSession().getSessionId(), new TIntObjectHashMap<>());
    }

    responseObserver.onNext(myServiceStub.startMonitoringApp(request));
    responseObserver.onCompleted();
  }

  public void stopMonitoringApp(MemoryProfiler.MemoryStopRequest request,
                                StreamObserver<MemoryProfiler.MemoryStopResponse> responseObserver) {
    if (myUseLegacyTracking) {
      // TODO: also stop any unfinished tracking session
      myLegacyTrackers.remove(request.getSession().getSessionId());
      myTrackingInfos.remove(request.getSession().getSessionId());
      myInProgressTrackingInfo.remove(request.getSession().getSessionId());
      myAllocatedClasses.remove(request.getSession().getSessionId());
      myAllocationStacks.remove(request.getSession().getSessionId());
    }

    responseObserver.onNext(myServiceStub.stopMonitoringApp(request));
    responseObserver.onCompleted();
  }

  public void getData(MemoryProfiler.MemoryRequest request, StreamObserver<MemoryProfiler.MemoryData> responseObserver) {
    try {
      MemoryProfiler.MemoryData data = myServiceStub.getData(request);

      if (myUseLegacyTracking) {
        synchronized (myUpdatingDataLock) {
          TLongObjectHashMap<AllocationsInfo> infos = myTrackingInfos.get(request.getSession().getSessionId());
          MemoryProfiler.MemoryData.Builder rebuilder = data.toBuilder();
          long requestStartTime = request.getStartTime();
          long requestEndTime = request.getEndTime();

          // Note - the following is going to continuously return any unfinished whose start times are before the request's end time.
          // Dedeup is handled in MemoryDataPoller.
          List<AllocationsInfo> infosToReturn = new ArrayList<>();
          infos.forEachValue(info -> {
            if (info.getStartTime() <= requestEndTime && info.getEndTime() > requestStartTime) {
              infosToReturn.add(info);
            }

            return true;
          });

          infosToReturn.sort(Comparator.comparingLong(AllocationsInfo::getStartTime));
          for (int i = 0; i < infosToReturn.size(); i++) {
            AllocationsInfo info = infosToReturn.get(i);
            rebuilder.addAllocationsInfo(info);
            long infoMax = info.getEndTime() == Long.MAX_VALUE ? info.getStartTime() : info.getEndTime();
            rebuilder.setEndTimestamp(Math.max(rebuilder.getEndTimestamp(), infoMax));
          }

          data = rebuilder.build();
        }
      }

      responseObserver.onNext(data);
      responseObserver.onCompleted();
    }
    catch (RuntimeException e) {
      responseObserver.onError(e);
    }
  }

  public void trackAllocations(TrackAllocationsRequest request,
                               StreamObserver<TrackAllocationsResponse> responseObserver) {
    long sessionId = request.getSession().getSessionId();
    long timestamp = request.getRequestTime();
    TrackAllocationsResponse response;
    if (myUseLegacyTracking) {
      response = request.getEnabled() ? enableAllocations(timestamp, sessionId) : disableAllocations(timestamp, sessionId);
    }
    else {
      // Post-O tracking - goes straight to perfd.
      response = myServiceStub.trackAllocations(request);
    }

    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  private TrackAllocationsResponse enableAllocations(long startTimeNs, long sessionId) {
    synchronized (myUpdatingDataLock) {
      if (myInProgressTrackingInfo.get(sessionId) != null) {
        // A previous tracking is still in-progress, cannot enable a new one.
        return TrackAllocationsResponse.newBuilder().setStatus(
          TrackStatus.newBuilder().setStatus(TrackStatus.Status.IN_PROGRESS)).build();
      }

      TLongObjectHashMap<AllocationsInfo> infos = myTrackingInfos.get(sessionId);
      TrackAllocationsResponse.Builder responseBuilder = TrackAllocationsResponse.newBuilder();
      LegacyAllocationTracker tracker = myLegacyTrackers.get(sessionId);
      boolean success = tracker.trackAllocations(true, null, null);
      if (success) {
        AllocationsInfo newInfo = AllocationsInfo.newBuilder()
          .setStartTime(startTimeNs)
          .setEndTime(Long.MAX_VALUE)
          .setLegacy(true)
          .build();
        responseBuilder.setInfo(newInfo);
        responseBuilder.setStatus(TrackStatus.newBuilder().setStatus(TrackStatus.Status.SUCCESS).setStartTime(startTimeNs));
        infos.put(startTimeNs, newInfo);
        myInProgressTrackingInfo.put(sessionId, newInfo);
      }
      else {
        responseBuilder.setStatus(TrackStatus.newBuilder().setStatus(TrackStatus.Status.FAILURE_UNKNOWN));
      }

      return responseBuilder.build();
    }
  }

  private TrackAllocationsResponse disableAllocations(long endtimeNs, long sessionId) {
    synchronized (myUpdatingDataLock) {
      AllocationsInfo lastInfo = myInProgressTrackingInfo.get(sessionId);
      if (lastInfo == null) {
        // No in-progress tracking, cannot disable one.
        return TrackAllocationsResponse.newBuilder().setStatus(
          TrackStatus.newBuilder().setStatus(TrackStatus.Status.NOT_ENABLED)).build();
      }

      LegacyAllocationTracker tracker = myLegacyTrackers.get(sessionId);
      TLongObjectHashMap<AllocationsInfo> infos = myTrackingInfos.get(sessionId);
      TrackAllocationsResponse.Builder responseBuilder = TrackAllocationsResponse.newBuilder();
      boolean success = tracker.trackAllocations(false, myFetchExecutor,
                                                 bytes -> saveAllocationData(sessionId, lastInfo.getStartTime(), bytes));
      AllocationsInfo.Builder lastInfoBuilder = lastInfo.toBuilder();
      lastInfoBuilder.setEndTime(endtimeNs);
      lastInfoBuilder.setSuccess(success);
      if (success) {
        responseBuilder.setStatus(TrackStatus.newBuilder().setStatus(TrackStatus.Status.SUCCESS).setStartTime(lastInfo.getStartTime()));
      }
      else {
        responseBuilder.setStatus(TrackStatus.newBuilder().setStatus(TrackStatus.Status.FAILURE_UNKNOWN));
      }

      AllocationsInfo updatedInfo = lastInfoBuilder.build();
      responseBuilder.setInfo(updatedInfo);
      infos.put(lastInfo.getStartTime(), updatedInfo);
      return responseBuilder.build();
    }
  }

  private void saveAllocationData(long sessionId, long infoId, @Nullable byte[] rawBytes) {
    synchronized (myUpdatingDataLock) {
      // Inserts an empty entry in the null case so that TransportServiceProxy don't go to the device daemon to look for an entry.
      myProxyBytesCache.put(String.valueOf(infoId), rawBytes == null ? ByteString.EMPTY : ByteString.copyFrom(rawBytes));
      myInProgressTrackingInfo.remove(sessionId);
    }
  }

  public void forceGarbageCollection(ForceGarbageCollectionRequest request, StreamObserver<ForceGarbageCollectionResponse> observer) {
    if (myDevice.isOnline()) {
      int processId = request.getSession().getPid();
      for (Client client : myDevice.getClients()) {
        if (processId == client.getClientData().getPid()) {
          client.executeGarbageCollector();
          break;
        }
      }
    }
    observer.onNext(ForceGarbageCollectionResponse.newBuilder().build());
    observer.onCompleted();
  }

  @Override
  public ServerServiceDefinition getServiceDefinition() {
    Map<MethodDescriptor, ServerCallHandler> overrides = new HashMap<>();
    overrides.put(MemoryServiceGrpc.METHOD_START_MONITORING_APP,
                  ServerCalls.asyncUnaryCall((request, observer) -> {
                    startMonitoringApp((MemoryStartRequest)request, (StreamObserver)observer);
                  }));
    overrides.put(MemoryServiceGrpc.METHOD_STOP_MONITORING_APP,
                  ServerCalls.asyncUnaryCall((request, observer) -> {
                    stopMonitoringApp((MemoryStopRequest)request, (StreamObserver)observer);
                  }));
    overrides.put(MemoryServiceGrpc.METHOD_GET_DATA,
                  ServerCalls.asyncUnaryCall((request, observer) -> {
                    getData((MemoryRequest)request, (StreamObserver)observer);
                  }));
    overrides.put(MemoryServiceGrpc.METHOD_TRACK_ALLOCATIONS,
                  ServerCalls.asyncUnaryCall((request, observer) -> {
                    trackAllocations((TrackAllocationsRequest)request, (StreamObserver)observer);
                  }));
    overrides.put(MemoryServiceGrpc.METHOD_FORCE_GARBAGE_COLLECTION,
                  ServerCalls.asyncUnaryCall((request, observer) -> {
                    forceGarbageCollection((ForceGarbageCollectionRequest)request, (StreamObserver)observer);
                  }));

    return generatePassThroughDefinitions(overrides, myServiceStub);
  }
}