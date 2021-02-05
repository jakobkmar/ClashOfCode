import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.30"
}

group = "net.axay"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}
