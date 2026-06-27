plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.compose.multiplatform)
    alias(libs.plugins.android.library)
}

group = "digital.vasic.uicomponents"
version = "1.0.0"

kotlin {
    androidTarget {
        compilations.all {
            compilerOptions.configure {
                jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_11)
            }
        }
    }

    jvm("desktop") {
        compilations.all {
            compilerOptions.configure {
                jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_11)
            }
        }
    }

    iosX64()
    iosArm64()
    iosSimulatorArm64()

    @OptIn(org.jetbrains.kotlin.gradle.ExperimentalWasmDsl::class)
    wasmJs {
        browser()
    }

    sourceSets {
        commonMain.dependencies {
            // iter-82: Use compose plugin DSL instead of version catalog to avoid artifact version mismatch.
            // Compose MP 1.11.0 uses internal versioning for material3 (pinned at 1.9.0) and other
            // sub-artifacts; compose.material3 from the plugin DSL resolves the correct version automatically.
            implementation(compose.runtime)
            implementation(compose.foundation)
            implementation(compose.material3)
            implementation(compose.ui)
            implementation(compose.uiUtil)
        }

        commonTest.dependencies {
            implementation(libs.bundles.testing)
        }
    }
}

android {
    namespace = "digital.vasic.uicomponents"
    compileSdk = 35

    defaultConfig {
        minSdk = 21
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}
