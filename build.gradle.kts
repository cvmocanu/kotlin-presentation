import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
   kotlin("jvm") version "1.6.10"
}

repositories {
    jcenter()
}

group = "net.mocanu.presentations"
version = "develop-SNAPSHOT"
description = "kotlin-presentation"

dependencies {
    implementation(kotlin("stdlib-jdk8"))

    implementation("org.apache.commons:commons-lang3:3.5")
    implementation("commons-io:commons-io:2.5")
}

configurations {
    implementation.get().resolutionStrategy.failOnVersionConflict()
}

val javaVersion = "11"
extensions.getByType(JavaPluginExtension::class.java).sourceCompatibility = JavaVersion.toVersion(javaVersion)

tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions.suppressWarnings = true
    kotlinOptions.apiVersion = "1.6"
    kotlinOptions.jvmTarget = javaVersion
    kotlinOptions.freeCompilerArgs = listOf(
        "-progressive"
    )
}
