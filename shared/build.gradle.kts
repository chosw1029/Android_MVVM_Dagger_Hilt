import com.android.build.gradle.internal.cxx.configure.gradleLocalProperties

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdk = Versions.COMPILE_SDK

    defaultConfig {
        minSdk = Versions.MIN_SDK
        targetSdk = Versions.TARGET_SDK

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")

        buildConfigField("String", "API_KEY", getApiKey("KAKAO_API"))
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

fun getApiKey(propertyKey: String): String {
    return gradleLocalProperties(rootDir).getProperty(propertyKey)
}

dependencies {
    api(project(":model"))

    implementation(AndroidX.APP_COMPAT)

    // Retrofit
    implementation(Retrofit.CORE)
    implementation(Retrofit.GSON_CONVERTER)
    implementation(Retrofit.RXJAVA_ADAPTER)

    // OKHTTP
    implementation(OkHttp.CORE)
    implementation(OkHttp.LOGGING_INTERCEPTOR)

    // Dagger Hilt
    implementation(DaggerHilt.DAGGER_HILT)
    kapt(DaggerHilt.COMPILER)

    // Google
    implementation(Google.GSON)

    // Utils
    implementation(Utils.TIMBER)

    testImplementation(Test.JUNIT)
    androidTestImplementation(Test.ANDROID_JUNIT_EXT)
    androidTestImplementation(Test.ESPRESSO_CORE)
}