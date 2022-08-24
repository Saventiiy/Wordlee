buildscript {
    repositories {
        google()
        mavenCentral()

    }

    allprojects {
        repositories {
            google()
            mavenCentral()
        }
    }

}// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "7.2.1" apply false
    id("com.android.library") version "7.2.1" apply false
    id ("org.jetbrains.kotlin.android") version "1.6.10" apply false
//    kotlin("org.jetbrains.kotlin.kapt") version "1.6.10"
//    classpath "com.android.tools.build:gradle:7.0.0"
//    id("com.android.tools.build:gradle") version "7.0.0"
    id("org.jetbrains.kotlin.jvm") version "1.6.10" apply false
}
