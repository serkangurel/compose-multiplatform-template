plugins {
    kotlin("multiplatform")
    id("com.android.application")
    id("org.jetbrains.compose")
}

kotlin {
    androidTarget()
    sourceSets {
        val androidMain by getting {
            dependencies {
                implementation(project(":shared"))
                implementation(Libs.Koin.android)
            }
        }
    }
}

android {
    compileSdk = Config.Build.compileSdk
    namespace = Config.androidNamespace

    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")

    defaultConfig {
        applicationId = Config.applicationId
        minSdk = Config.Build.minSdk
        targetSdk = Config.Build.targetSdk
        versionCode = Config.Build.versionCode
        versionName = Config.Build.versionName
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlin {
        jvmToolchain(17)
    }
}
