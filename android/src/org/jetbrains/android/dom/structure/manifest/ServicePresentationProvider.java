/*
 * Copyright (C) 2016 The Android Open Source Project
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
package org.jetbrains.android.dom.structure.manifest;

import com.intellij.ide.presentation.PresentationProvider;
import com.intellij.psi.PsiClass;
import org.jetbrains.android.dom.manifest.Service;
import org.jetbrains.annotations.Nullable;

public class ServicePresentationProvider extends PresentationProvider<Service> {
  @Nullable
  @Override
  public String getName(Service service) {
    final PsiClass aClass = service.getServiceClass().getValue();
    return aClass == null ? null : aClass.getName();
  }

  @Nullable
  @Override
  public String getTypeName(Service service) {
    return "Service";
  }
}
