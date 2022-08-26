object Versions {
    const val versionName = "1.0.0" // X.Y.Z; X = Major, Y = minor, Z = Patch level
    private const val versionCodeBase = 10000 // XYYZZM; M = Module (tv, mobile)
    const val versionCodeMobile = versionCodeBase + 3

    const val COMPILE_SDK = 32
    const val TARGET_SDK = 32
    const val MIN_SDK = 21

    const val ANDROID_GRADLE_PLUGIN = "7.2.2"
    const val KOTLIN = "1.7.10"

    //=================== Lib Versions =====================
    // AndroidX
    const val CORE = "1.8.0"
    const val APP_COMPAT = "1.5.0"
    const val CONSTRAINT_LAYOUT = "2.1.4"

    // Google
    const val MATERIAL_3 = "1.5.0-alpha04"
    const val GSON = "2.9.1"

    // Navigation
    const val NAVIGATION = "2.5.1"

    // Dagger Hilt
    const val HILT_AGP = "2.43.2"

    // Retrofit
    const val RETROFIT = "2.9.0"

    // OKHTTP
    const val OKHTTP = "4.10.0"

    // Utils
    const val TIMBER = "4.7.1"

    // Test
    const val JUNIT = "4.13.2"
    const val ANDROID_JUNIT_EXT = "1.1.3"
    const val ESPRESSO_CORE = "3.4.0"
}
