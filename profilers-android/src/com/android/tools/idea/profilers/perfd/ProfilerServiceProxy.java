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


import com.android.tools.idea.transport.ServiceProxy;
import com.android.tools.profiler.proto.ProfilerServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ServerServiceDefinition;
import java.util.Collections;
import org.jetbrains.annotations.NotNull;

/**
 * A simple pass-through proxy for the ProfilerService. All logic is handled on device side.
 */
public class ProfilerServiceProxy extends ServiceProxy {
  private ProfilerServiceGrpc.ProfilerServiceBlockingStub myServiceStub;

  public ProfilerServiceProxy(@NotNull ManagedChannel channel) {
    super(ProfilerServiceGrpc.getServiceDescriptor());
    myServiceStub = ProfilerServiceGrpc.newBlockingStub(channel);
  }

  @Override
  public ServerServiceDefinition getServiceDefinition() {
    return generatePassThroughDefinitions(Collections.emptyMap(), myServiceStub);
  }
}
