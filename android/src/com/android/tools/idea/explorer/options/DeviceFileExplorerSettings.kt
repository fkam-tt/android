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
package com.android.tools.idea.explorer.options

import com.google.common.base.Strings
import com.intellij.openapi.components.PersistentStateComponent
import com.intellij.openapi.components.ServiceManager
import com.intellij.openapi.components.State
import com.intellij.openapi.components.Storage
import com.intellij.openapi.util.SystemInfo
import com.intellij.openapi.util.io.FileUtil
import com.intellij.util.xmlb.XmlSerializerUtil
import java.nio.file.Paths
import javax.swing.filechooser.FileSystemView

/**
 * Persistent Device File Explorer settings
 */
@State(name = "DeviceFileExplorer", storages = [Storage("deviceFileExplorer.xml")])
class DeviceFileExplorerSettings : PersistentStateComponent<DeviceFileExplorerSettings> {
  var downloadLocation: String = getDefaultDownloadLocation()

  companion object {
    @JvmStatic
    fun getInstance(): DeviceFileExplorerSettings {
      return ServiceManager.getService(DeviceFileExplorerSettings::class.java)
    }
  }

  override fun getState(): DeviceFileExplorerSettings {
    return this
  }

  override fun loadState(state: DeviceFileExplorerSettings) {
    XmlSerializerUtil.copyBean(state, this)
  }

  /** Get default path for Device File Explorer downloaded files, originally in DeviceExplorerFileManagerImpl */
  private fun getDefaultDownloadLocation(): String {
    val userHome: String = System.getProperty("user.home")
    var path: String? = null

    when {
      SystemInfo.isWindows -> path = FileSystemView.getFileSystemView().defaultDirectory.path
      SystemInfo.isMac -> path = FileUtil.join(userHome, "Documents")
      SystemInfo.isLinux -> path = userHome
    }

    if (Strings.isNullOrEmpty(path)) {
      throw RuntimeException("Platform is not supported")
    }

    return Paths.get(path, "AndroidStudio", "DeviceExplorer").toString()
  }
}
