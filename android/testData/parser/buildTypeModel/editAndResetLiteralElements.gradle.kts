android {
  buildTypes {
    create("xyz") {
      applicationIdSuffix("mySuffix")
      debuggable(true)
      embedMicroApp(false)
      jniDebuggable(true)
      minifyEnabled(false)
      multiDexEnabled(true)
      pseudoLocalesEnabled(false)
      renderscriptDebuggable(true)
      renderscriptOptimLevel(1)
      shrinkResources(false)
      testCoverageEnabled(true)
      useJack(false)
      versionNameSuffix("abc")
      zipAlignEnabled(true)
    }
  }
}
