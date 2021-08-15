pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
    plugins {
        kotlin("jvm") version "1.5.21"
        kotlin("multiplatform") version "1.5.21"
        id("me.champeau.gradle.jmh") version "0.5.3"
        id("io.morethan.jmhreport") version "0.9.0"
        id("org.jetbrains.compose") version "0.5.0-build270"
    }
}

include(":benchmarks")
include(":ui")

