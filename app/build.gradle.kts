plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdk = Versions.COMPILE_SDK

    defaultConfig {
        applicationId = "com.nextus.mvvm"
        minSdk = Versions.MIN_SDK
        targetSdk = Versions.TARGET_SDK
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    buildFeatures {
        viewBinding = true
        dataBinding = true
    }

    kotlinOptions {
        val options = this
        options.jvmTarget = "1.8"
    }
}

dependencies {

    // AndroidX
    implementation(AndroidX.CORE)
    implementation(AndroidX.APP_COMPAT)
    implementation(AndroidX.CONSTRAINT_LAYOUT)

    // Material
    implementation(Google.MATERIAL_3)

    // Navigation
    implementation(Navigation.FRAGMENT_KTX)
    implementation(Navigation.UI_KTX)

    // Dagger Hilt
    implementation(DaggerHilt.DAGGER_HILT)
    kapt(DaggerHilt.COMPILER)

    // Retrofit
    implementation(Retrofit.CORE)
    implementation(Retrofit.GSON_CONVERTER)
    implementation(Retrofit.RXJAVA_ADAPTER)

    // OKHTTP
    implementation(OkHttp.CORE)
    implementation(OkHttp.LOGGING_INTERCEPTOR)

    // Utils
    implementation(Utils.TIMBER)

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
}