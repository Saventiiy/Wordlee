pluginManagement {
    repositories {
        gradlePluginPortal() // kotlin-dsl, kotlin, jvm, kapt, org.jetbrains.kotlin.android
        google()  // com.android.library
        mavenCentral()
    }
}

rootProject.name = "Wordly"
include (":app")
