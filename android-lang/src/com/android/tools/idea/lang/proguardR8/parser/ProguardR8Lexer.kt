/*
 * Copyright (C) 2019 The Android Open Source Project
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
package com.android.tools.idea.lang.proguardR8.parser

import com.intellij.lexer.FlexAdapter

/**
 * Implements parser for ProguardR8
 *
 * acceptJavaIdentifiers flag switch lexer to the state in which it can to accept java identifiers,
 * @see _ProguardR8Lexer.flex
 */
class ProguardR8Lexer(private val acceptJavaIdentifiers: Boolean = false) : FlexAdapter(_ProguardR8Lexer()) {

  override fun getFlex(): _ProguardR8Lexer {
    return super.getFlex() as _ProguardR8Lexer
  }

  override fun start(buffer: CharSequence, startOffset: Int, endOffset: Int, initialState: Int) {
    super.start(buffer, startOffset, endOffset, if (acceptJavaIdentifiers) _ProguardR8Lexer.STATE_JAVA_SECTION_HEADER else initialState)
  }
}