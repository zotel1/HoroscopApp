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
    id("com.android.application") version "8.7.3" apply false
    id("org.jetbrains.kotlin.android") version "1.8.0" apply false

}
