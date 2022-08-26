object Kotlin {
    const val SDK = "org.jetbrains.java:java-stdlib-jdk8:1.5.21"
}

object AndroidX {
    const val CORE = "androidx.core:core-ktx:${Versions.CORE}"
    const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:${Versions.CONSTRAINT_LAYOUT}"
    const val APP_COMPAT = "androidx.appcompat:appcompat:${Versions.APP_COMPAT}"
}

object DaggerHilt {
    const val DAGGER_HILT = "com.google.dagger:hilt-android:${Versions.HILT_AGP}"
    const val COMPILER = "com.google.dagger:hilt-android-compiler:${Versions.HILT_AGP}"
}

object Navigation {
    const val FRAGMENT_KTX = "androidx.navigation:navigation-fragment-ktx:${Versions.NAVIGATION}"
    const val UI_KTX = "androidx.navigation:navigation-ui-ktx:${Versions.NAVIGATION}"
}

object Retrofit {
    const val CORE = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT}"
    const val GSON_CONVERTER = "com.squareup.retrofit2:converter-gson:${Versions.RETROFIT}"
    const val RXJAVA_ADAPTER = "com.squareup.retrofit2:adapter-rxjava2:${Versions.RETROFIT}"
}

object OkHttp {
    const val CORE = "com.squareup.okhttp3:okhttp:${Versions.OKHTTP}"
    const val LOGGING_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor:${Versions.OKHTTP}"
}

object Google {
    const val MATERIAL_3 = "com.google.android.material:material:${Versions.MATERIAL_3}"
    const val GSON = "com.google.code.gson:gson:${Versions.GSON}"
}

object Utils {
    const val TIMBER = "com.jakewharton.timber:timber:${Versions.TIMBER}"
}

object Test {
    const val JUNIT = "junit:junit:${Versions.JUNIT}"
    const val ANDROID_JUNIT_EXT = "androidx.test.ext:junit:${Versions.ANDROID_JUNIT_EXT}"
    const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:${Versions.ESPRESSO_CORE}"
}