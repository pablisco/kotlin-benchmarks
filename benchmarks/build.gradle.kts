plugins {
    kotlin("jvm")
    id("me.champeau.gradle.jmh")
    id("io.morethan.jmhreport")
}

repositories {
    mavenCentral()
}

dependencies {
    jmh("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.5.21")
    jmh("org.openjdk.jmh:jmh-core:1.33")
    jmh("org.openjdk.jmh:jmh-generator-annprocess:1.33")
}

jmh {
    jvmArgsAppend = listOf("-Djmh.separateClasspathJAR=true", "-XX:+UseParallelGC")
    resultFormat = "JSON"
    verbosity = "SILENT"
    iterations = 3
    warmupIterations = 1
    timeUnit = "ns"
    benchmarkMode = listOf("all")
    fork = 2
    threads = 4
}

jmhReport {
    jmhResultPath = "build/reports/jmh/results.json"
    jmhReportOutput = "build/reports/jmh"
}
