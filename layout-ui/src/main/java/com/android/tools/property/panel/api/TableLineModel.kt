/*
 * Copyright (C) 2018 The Android Open Source Project
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
package com.android.tools.property.panel.api

import com.android.tools.property.ptable2.PTableItem
import com.android.tools.property.ptable2.PTableModel

/**
 * The model of a table in an inspector.
 */
interface TableLineModel: InspectorLineModel {

  /**
   * The table model for the table embedded in this inspector line.
   */
  val tableModel: PTableModel

  /**
   * The item currently selected in the table.
   */
  val selectedItem: PTableItem?

  /**
   * Returns the visible item count taking filtering into account.
   */
  val itemCount: Int

  /**
   * Request focus in a specified item.
   */
  fun requestFocus(item: PTableItem)

  /**
   * Request focus in item with best filter match.
   */
  fun requestFocusInBestMatch()

  /**
   * Stop editing the any table item.
   */
  fun stopEditing()
}
