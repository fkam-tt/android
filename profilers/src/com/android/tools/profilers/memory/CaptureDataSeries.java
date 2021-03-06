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
package com.android.tools.profilers.memory;

import com.android.tools.adtui.model.DataSeries;
import com.android.tools.profiler.proto.Common;
import com.android.tools.profilers.ProfilerClient;
import com.android.tools.profilers.analytics.FeatureTracker;
import com.android.tools.profilers.memory.adapters.CaptureObject;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

abstract class CaptureDataSeries<T extends CaptureObject> implements DataSeries<CaptureDurationData<T>> {
  @NotNull protected final ProfilerClient myClient;
  @NotNull protected final Common.Session mySession;
  @NotNull protected final FeatureTracker myFeatureTracker;

  protected CaptureDataSeries(@NotNull ProfilerClient client,
                              @NotNull Common.Session session,
                              @NotNull FeatureTracker featureTracker) {
    myClient = client;
    mySession = session;
    myFeatureTracker = featureTracker;
  }

  protected static long getHostTime(long timeNs) {
    return TimeUnit.NANOSECONDS.toMicros(timeNs);
  }

  protected static long getDurationUs(long startTimeNs, long endTimeNs) {
    return endTimeNs == Long.MAX_VALUE
           ? Long.MAX_VALUE
           : TimeUnit.NANOSECONDS.toMicros(endTimeNs) - TimeUnit.NANOSECONDS.toMicros(startTimeNs);
  }
}
