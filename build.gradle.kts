buildscript {
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://maven.fabric.io/public") }
        maven { url = uri("https://jitpack.io") }
    }
    dependencies {
        classpath("com.android.tools.build:gradle:${Versions.ANDROID_GRADLE_PLUGIN}")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.KOTLIN}")
        classpath("com.google.dagger:hilt-android-gradle-plugin:${Versions.HILT_AGP}")
        /*
        classpath("com.amplifyframework:amplify-tools-gradle-plugin:${Versions.AMPLIFY}")
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.NAVIGATION}")
        classpath("com.google.firebase:firebase-crashlytics-gradle:${Versions.CRASHLYTICS}")
        classpath("com.google.gms:google-services:${Versions.GOOGLE_SERVICES}")
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files

        classpath("com.android.tools.build:gradle:${Versions.ANDROID_GRADLE_PLUGIN}")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.KOTLIN}")
        classpath("org.jetbrains.kotlin:kotlin-serialization:${Versions.KOTLIN}")
        classpath("com.google.dagger:hilt-android-gradle-plugin:${Versions.HILT_AGP}")

        classpath("com.google.gms:google-services:${Versions.GOOGLE_SERVICES}")
        classpath("androidx.benchmark:benchmark-gradle-plugin:${Versions.BENCHMARK}")
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.NAVIGATION}")
        classpath("com.google.firebase:firebase-crashlytics-gradle:${Versions.FIREBASE_CRASHLYTICS}")*/
    }
}

/*// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "7.2.2"
    id("org.jetbrains.kotlin.android") version "1.7.10"
    id("org.jetbrains.kotlin.jvm") version "1.7.10"
}*/

task("clean", Delete::class) {
    delete = setOf(rootProject.buildDir)
}