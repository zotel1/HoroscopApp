buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        // Dependencias específicas para el nivel raíz
    }
}

plugins {
    id("com.android.application") version "8.0.0" apply false
    id("org.jetbrains.kotlin.android") version "1.8.0" apply false

}
