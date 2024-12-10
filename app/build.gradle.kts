plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
   // alias(libs.plugins.androidx.navigation.safe.args.kotlin)
    id("com.google.dagger.hilt.android") version "2.48.1" apply true
    id("kotlin-kapt") // Plugin necesario para Hilt
    id("androidx.navigation.safeargs.kotlin") // Safe Args para generación de clases seguras
}

android {
    namespace = "com.zoteldev.horoscopapp"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.zoteldev.horoscopapp"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        viewBinding = true
    }
    kotlin {
        jvmToolchain(8)
    }
}

dependencies {

    implementation(libs.navigation.fragment.ktx)
    implementation(libs.navigation.ui.ktx)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler) // Para la generación de código
    implementation(libs.hilt.navigation.compose) // Opcional, si usas Jetpack Compose
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
}