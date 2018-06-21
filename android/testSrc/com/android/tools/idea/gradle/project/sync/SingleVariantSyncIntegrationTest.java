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
package com.android.tools.idea.gradle.project.sync;

import com.android.tools.idea.gradle.project.sync.messages.GradleSyncMessagesStub;
import com.android.tools.idea.project.messages.MessageType;
import com.android.tools.idea.project.messages.SyncMessage;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.project.Project;
import org.jetbrains.android.facet.AndroidFacet;

import java.io.File;
import java.util.List;

import static com.android.tools.idea.gradle.project.sync.messages.SyncMessageSubject.syncMessage;
import static com.android.tools.idea.testing.TestProjectPaths.DEPENDENT_MODULES;
import static com.google.common.truth.Truth.assertAbout;
import static com.google.common.truth.Truth.assertThat;
import static com.intellij.openapi.util.io.FileUtil.appendToFile;

public class SingleVariantSyncIntegrationTest extends NewGradleSyncIntegrationTest {

  @Override
  protected boolean useSingleVariantSyncInfrastructure() {
    return true;
  }

  @Override
  public void testSyncIssueWithNonMatchingVariantAttributes() throws Exception {
    Project project = getProject();
    GradleSyncMessagesStub syncMessages = GradleSyncMessagesStub.replaceSyncMessagesService(project);

    // DEPENDENT_MODULES project has two modules, app and lib, app module has dependency on lib module.
    loadProject(DEPENDENT_MODULES);

    // Define new buildType qa in app module.
    // This causes sync issues, because app depends on lib module, but lib module doesn't have buildType qa.
    File appBuildFile = getBuildFilePath("app");
    appendToFile(appBuildFile, "\nandroid.buildTypes { qa { } }\n");

    // Make paidQa the selected variant, because only the selected variant is requested in Single-Variant sync.
    Module appModule = getModule("app");
    AndroidFacet facet = AndroidFacet.getInstance(appModule);
    facet.getProperties().SELECTED_BUILD_VARIANT = "paidQa";

    try {
      requestSyncAndWait();
    }
    catch (AssertionError expected) {
      // Sync issues are expected.
    }

    // Verify sync issues are reported properly.
    List<SyncMessage> messages = syncMessages.getReportedMessages();
    assertThat(messages).hasSize(2);
    SyncMessage message = messages.get(0);
    // @formatter:off
    // Verify text contains both of single line and multi-line message from SyncIssue.
    assertAbout(syncMessage()).that(message).hasType(MessageType.ERROR)
                                            .hasGroup("Unresolved dependencies")
                                            .hasMessageLine("Unable to resolve dependency for ':app@paidQa/compileClasspath': Could not resolve project :lib.", 0);
    // @formatter:on
  }
}
