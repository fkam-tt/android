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
package com.android.tools.idea.tests.gui.debugger;

import com.android.tools.idea.tests.gui.emulator.EmulatorTestRule;
import com.android.tools.idea.tests.gui.framework.GuiTestRunner;
import com.android.tools.idea.tests.gui.framework.RunIn;
import com.android.tools.idea.tests.gui.framework.TestGroup;
import com.android.tools.idea.tests.gui.framework.fixture.*;
import com.android.tools.idea.tests.gui.framework.fixture.avdmanager.ChooseSystemImageStepFixture;
import com.intellij.openapi.util.Ref;
import org.fest.swing.exception.LocationUnavailableException;
import org.fest.swing.timing.Wait;
import org.fest.swing.util.PatternTextMatcher;
import org.jetbrains.annotations.NotNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(GuiTestRunner.class)
public class AbiSplitApksTest extends DebuggerTestBase {
  @Rule public final NativeDebuggerGuiTestRule guiTest = new NativeDebuggerGuiTestRule();
  @Rule public final EmulatorTestRule emulator = new EmulatorTestRule();

  private final static String ABI_TYPE_X86 = "x86";
  private final static String ABI_TYPE_X86_64 = "x86_64";
  private final static int GRADLE_SYNC_TIMEOUT = 60;

  /**
   * Verifies ABI split apks are generated as per the target emulator/device during a native
   * debug session.
   * <p>
   * This is run to qualify releases. Please involve the test team in substantial changes.
   * <p>
   * TT ID: 6b2878da-4464-4c32-be85-dd20a2f1bff2
   * <p>
   *   <pre>
   *   Test Steps:
   *   1. Import BasicCmakeAppForUI.
   *   2. Enable split by adding the following to app/build.gradle: android.splits.abi.enable true.
   *   3. Start a native debugging session in Android Studio (deploy in emulator X86_64).
   *   4. Now hit the stop button.
   *   4. Go the folder ~<project folder="">/app/build/intermediates/instant-run-apk/debug and check
   *      the apk generated (Verify 1, 2).
   *   Verify:
   *   1. APK generated should not be universal (You can verify this by trying to install the apk
   *      in a non X86_64 emulator or device)
   *   2. APK generated should explicitly for the ABI X86_64
   *   </pre>
   */
  @Test
  @RunIn(TestGroup.QA_UNRELIABLE) // b/70633876
  public void testX64AbiSplitApks() throws Exception {
    testAbiSplitApks(ABI_TYPE_X86_64);
  }

  /**
   * Verifies ABI split apks are generated as per the target emulator/device during a native
   * debug session.
   * <p>
   * This is run to qualify releases. Please involve the test team in substantial changes.
   * <p>
   * TT ID: 6b2878da-4464-4c32-be85-dd20a2f1bff2
   * <p>
   *   <pre>
   *   Test Steps:
   *   1. Import BasicCmakeAppForUI.
   *   2. Enable split by adding the following to app/build.gradle: android.splits.abi.enable true.
   *   3. Start a native debugging session in Android Studio (deploy in emulator X86).
   *   4. Now hit the stop button.
   *   4. Go the folder ~<project folder="">/app/build/outputs/apk and check
   *      the apk generated (Verify 1, 2).
   *   Verify:
   *   1. APK generated should not be universal (You can verify this by trying to install the apk
   *      in a non X86 emulator or device)
   *   2. APK generated should explicitly for the ABI X86
   *   </pre>
   */
  @Test
  @RunIn(TestGroup.SANITY)
  public void testX86AbiSplitApks() throws Exception {
    testAbiSplitApks(ABI_TYPE_X86);
  }

  private void testAbiSplitApks(@NotNull String abiType) throws Exception {
    IdeFrameFixture ideFrame = guiTest.importProject("BasicCmakeAppForUI");
    ideFrame.waitForGradleProjectSyncToFinish(Wait.seconds(GRADLE_SYNC_TIMEOUT));

    DebuggerTestUtil.setDebuggerType(ideFrame, DebuggerTestUtil.NATIVE);

    ideFrame.getEditor()
      .open("app/build.gradle", EditorFixture.Tab.EDITOR)
      .moveBetween("apply plugin: 'com.android.application'", "")
      .enterText("\n\nandroid.splits.abi.enable true")
      .invokeAction(EditorFixture.EditorAction.SAVE);

    ideFrame.requestProjectSync().waitForGradleProjectSyncToFinish(Wait.seconds(GRADLE_SYNC_TIMEOUT));

    openAndToggleBreakPoints(ideFrame,
                             "app/src/main/jni/native-lib.c",
                             "return (*env)->NewStringUTF(env, message);");

    Ref<String> apkNameRef = new Ref<>();
    if (abiType.equals(ABI_TYPE_X86)) {
      apkNameRef.set("app-x86-debug.apk");
      emulator.createDefaultAVD(guiTest.ideFrame().invokeAvdManager());
    } else if (abiType.equals(ABI_TYPE_X86_64)) {
      apkNameRef.set("app-x86_64-debug.apk");
      emulator.createAVD(
        guiTest.ideFrame().invokeAvdManager(),
        "x86 Images",
        new ChooseSystemImageStepFixture.SystemImage("Marshmallow",
                                                     "23",
                                                     "x86_64",
                                                     "Android 6.0 (Google APIs)"),
        emulator.getDefaultAvdName());
    } else {
      throw new RuntimeException("Not supported ABI type provided: " + abiType);
    }

    ideFrame.debugApp(DEBUG_CONFIG_NAME)
      .selectDevice(emulator.getDefaultAvdName())
      .clickOk();

    // Wait for session to start: For x64, it takes longer time to wait for emulator come online.
    ExecutionToolWindowFixture.ContentFixture contentFixture = new DebugToolWindowFixture(ideFrame)
      .findContent(DEBUG_CONFIG_NAME);
    contentFixture.waitForOutput(new PatternTextMatcher(DEBUGGER_ATTACHED_PATTERN), EmulatorTestRule.DEFAULT_EMULATOR_WAIT_SECONDS);

    ideFrame.stopApp();
    ProjectViewFixture.PaneFixture projectPane = ideFrame.getProjectView().selectProjectPane();

    Wait.seconds(30).expecting("The apk file is generated.").until(() -> {
      try {
        projectPane.clickPath("BasicCmakeAppForUI",
                              "app",
                              "build",
                              "intermediates",
                              "instant-run-apk",
                              "debug",
                              apkNameRef.get());
        return true;
      } catch (LocationUnavailableException e) {
        return false;
      }
    });
  }
 }
