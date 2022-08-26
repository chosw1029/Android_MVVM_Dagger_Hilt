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
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.NAVIGATION}")
    }
}

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version(Versions.ANDROID_GRADLE_PLUGIN) apply(false)
    id("org.jetbrains.kotlin.android") version(Versions.KOTLIN) apply(false)
    id("org.jetbrains.kotlin.jvm") version(Versions.KOTLIN) apply(false)
}

task("clean", Delete::class) {
    delete = setOf(rootProject.buildDir)
}