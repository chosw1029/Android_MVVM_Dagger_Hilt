object Kotlin {
    const val SDK = "org.jetbrains.java:java-stdlib-jdk8:1.5.21"
}

object AndroidX {
    const val CORE = "androidx.core:core-ktx:${Versions.CORE}"
    const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:${Versions.CONSTRAINT_LAYOUT}"
    const val APP_COMPAT = "androidx.appcompat:appcompat:${Versions.APP_COMPAT}"

    const val MATERIAL = "androidx.compose.material:material:1.0.0-rc02"
    const val LEGACY = "androidx.legacy:legacy-support-v4:1.0.0"
    const val LIFECYCLE_VIEW_MODEL = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.1"
    const val LIFECYCLE_LIVEDATA = "androidx.lifecycle:lifecycle-livedata-ktx:2.3.1"
    const val ACTIVITY = "androidx.activity:activity-ktx:1.3.1"
    const val FRAGMENT = "androidx.fragment:fragment-ktx:1.3.6"
    const val DATASTORE = "androidx.datastore:datastore-preferences:1.0.0"
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
}

object Utils {
    const val TIMBER = "com.jakewharton.timber:timber:${Versions.TIMBER}"
}