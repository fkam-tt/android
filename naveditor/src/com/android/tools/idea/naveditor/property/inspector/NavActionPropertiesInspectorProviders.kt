// Copyright (C) 2017 The Android Open Source Project
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package com.android.tools.idea.naveditor.property.inspector

import org.jetbrains.android.dom.navigation.NavigationSchema

class NavActionTransitionInspectorProvider : NavPropertiesInspectorProvider(mapOf(
    NavigationSchema.ATTR_ENTER_ANIM to "Enter",
    NavigationSchema.ATTR_EXIT_ANIM to "Exit",
    NavigationSchema.ATTR_POP_ENTER_ANIM to "Pop Enter",
    NavigationSchema.ATTR_POP_EXIT_ANIM to "Pop Exit"), "Animations")

class NavActionPopInspectorProvider : NavPropertiesInspectorProvider(mapOf(
    NavigationSchema.ATTR_POP_UP_TO to "Pop To",
    NavigationSchema.ATTR_POP_UP_TO_INCLUSIVE to "Inclusive"), "Pop Behavior")

class NavActionLaunchOptionsInspectorProvider : NavPropertiesInspectorProvider(mapOf(
    NavigationSchema.ATTR_SINGLE_TOP to "Single Top"), "Launch Options")
