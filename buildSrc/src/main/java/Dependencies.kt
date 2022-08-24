object Dependencies {

    object Compose {
        const val version = "1.1.1"
        const val ui = "androidx.compose.ui:ui:$version"
        const val material = "androidx.compose.material:material:$version"
        const val tooling = "androidx.compose.ui:ui-tooling-preview:$version"
        const val livedata = "androidx.compose.runtime:runtime-livedata:$version"
        const val debugTooling = "androidx.compose.ui:ui-tooling:$version"
        const val foundation = "androidx.compose.foundation:foundation:1.3.0-alpha02"

        private const val glanceVersion = "1.0.0-alpha04"
        const val glance = "androidx.glance:glance:$glanceVersion"
        const val glanceWidget = "androidx.glance:glance-appwidget:$glanceVersion"

        const val accompanist = "com.google.accompanist:accompanist-systemuicontroller:0.18.0"
        const val accompanistPager = "com.google.accompanist:accompanist-pager:0.18.0"
    }

    object Kotlin {
        const val serialization = "org.jetbrains.kotlinx:kotlinx-serialization-json:1.2.2"
    }

    object Navigation {
        const val version = "2.4.2"
        const val navigationCompose = "androidx.navigation:navigation-compose:$version"
        const val navigationCommon = "androidx.navigation:navigation-common-ktx:$version"
    }

    object Android {
        const val coreKtx = "androidx.core:core-ktx:1.6.0"
        const val appCompat = "androidx.appcompat:appcompat:1.3.1"
        const val material = "com.google.android.material:material:1.4.0"
    }


    object Lifecycle {
        const val lifecycleKtx = "androidx.lifecycle:lifecycle-runtime-ktx:2.3.1"
        const val viewModelCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:1.0.0-alpha07"
        const val activityCompose = "androidx.activity:activity-compose:1.3.1"
    }

    object Dagger {
        private const val version = "2.42"
        const val dagger = "com.google.dagger:dagger:$version"
        const val daggerCompiler = "com.google.dagger:dagger-compiler:$version"
    }

    object Room {
        private const val version = "2.3.0"
        const val ktx = "androidx.room:room-ktx:$version"
        const val runtime = "androidx.room:room-runtime:$version"
        const val paging = "androidx.room:room-paging:2.4.0-alpha04"
        const val compiler = "androidx.room:room-compiler:$version"
    }

}