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
package com.android.tools.idea.gradle.dsl.parser.repositories;

import com.android.tools.idea.gradle.dsl.parser.elements.GradleDslBlockElement;
import com.android.tools.idea.gradle.dsl.parser.elements.GradleDslElement;
import com.android.tools.idea.gradle.dsl.parser.elements.GradleNameElement;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class FlatDirRepositoryDslElement extends GradleDslBlockElement {
  @NonNls public static final String FLAT_DIR_BLOCK_NAME = "flatDir";

  public FlatDirRepositoryDslElement(@NotNull GradleDslElement parent) {
    super(parent, GradleNameElement.create(FLAT_DIR_BLOCK_NAME));
  }

  @Override
  public void addParsedElement(@NotNull GradleDslElement element) {
    if (element.getName().equals("dir") || element.getName().equals("dirs")) {
      addToParsedExpressionList("dirs", element);
      return;
    }
    super.addParsedElement(element);
  }
}
