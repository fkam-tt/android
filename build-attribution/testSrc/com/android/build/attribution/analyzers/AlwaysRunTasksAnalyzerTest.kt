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
package com.android.build.attribution.analyzers

import com.android.SdkConstants
import com.android.build.attribution.BuildAttributionManager
import com.android.build.attribution.BuildAttributionManagerImpl
import com.android.build.attribution.BuildAttributionWarningsFilter
import com.android.build.attribution.data.AlwaysRunTaskData
import com.android.tools.idea.flags.StudioFlags
import com.android.tools.idea.testing.AndroidGradleProjectRule
import com.android.tools.idea.testing.TestProjectPaths.SIMPLE_APPLICATION
import com.android.utils.FileUtils
import com.google.common.truth.Truth.assertThat
import com.intellij.openapi.components.ServiceManager
import com.intellij.openapi.util.io.FileUtil
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import java.io.File

class AlwaysRunTasksAnalyzerTest {
  @get:Rule
  val myProjectRule = AndroidGradleProjectRule()

  @Before
  fun setUp() {
    StudioFlags.BUILD_ATTRIBUTION_ENABLED.override(true)
  }

  @After
  fun tearDown() {
    StudioFlags.BUILD_ATTRIBUTION_ENABLED.clearOverride()
  }

  private fun setUpProject() {
    myProjectRule.load(SIMPLE_APPLICATION)

    FileUtil.appendToFile(FileUtils.join(File(myProjectRule.project.basePath!!), "app", SdkConstants.FN_BUILD_GRADLE), """
      task dummy {
          doLast {
              // do nothing
          }
      }

      task dummy2 {
          doLast {
              // do nothing
          }

          outputs.upToDateWhen { false }
          dependsOn dummy
      }

      afterEvaluate { project ->
          android.applicationVariants.all { variant ->
              def mergeResourcesTask = tasks.getByPath("merge${"$"}{variant.name.capitalize()}Resources")
              mergeResourcesTask.dependsOn dummy2
          }
      }
    """.trimIndent())
  }

  @Test
  fun testAlwaysRunTasksAnalyzer() {
    setUpProject()

    myProjectRule.invokeTasks("assembleDebug")

    val buildAttributionManager = ServiceManager.getService(myProjectRule.project,
                                                            BuildAttributionManager::class.java) as BuildAttributionManagerImpl

    val alwaysRunTasks = buildAttributionManager.analyzersProxy.getAlwaysRunTasks().sortedBy { it.taskData.taskName }

    assertThat(alwaysRunTasks).hasSize(2)

    assertThat(alwaysRunTasks[0].taskData.getTaskPath()).isEqualTo(":app:dummy")
    assertThat(alwaysRunTasks[0].taskData.taskType).isEqualTo("org.gradle.api.DefaultTask")
    assertThat(alwaysRunTasks[0].taskData.originPlugin.toString()).isEqualTo("script build.gradle")
    assertThat(alwaysRunTasks[0].rerunReason).isEqualTo(AlwaysRunTaskData.Reason.NO_OUTPUTS_WITH_ACTIONS)

    assertThat(alwaysRunTasks[1].taskData.getTaskPath()).isEqualTo(":app:dummy2")
    assertThat(alwaysRunTasks[1].taskData.taskType).isEqualTo("org.gradle.api.DefaultTask")
    assertThat(alwaysRunTasks[1].taskData.originPlugin.toString()).isEqualTo("script build.gradle")
    assertThat(alwaysRunTasks[1].rerunReason).isEqualTo(AlwaysRunTaskData.Reason.UP_TO_DATE_WHEN_FALSE)
  }

  @Test
  fun testAlwaysRunTasksAnalyzerWithSuppressedWarning() {
    setUpProject()

    BuildAttributionWarningsFilter.getInstance(myProjectRule.project).suppressAlwaysRunTaskWarning("org.gradle.api.DefaultTask",
                                                                                                   "build.gradle")

    myProjectRule.invokeTasks("assembleDebug")

    val buildAttributionManager = ServiceManager.getService(myProjectRule.project,
                                                            BuildAttributionManager::class.java) as BuildAttributionManagerImpl

    assertThat(buildAttributionManager.analyzersProxy.getAlwaysRunTasks()).isEmpty()
  }
}
