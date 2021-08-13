package com.pablisco.kotlin.benchmarks

import org.openjdk.jmh.annotations.*

open class LazyBenchmark {

    @Benchmark
    fun synchronisedLazy(): String = LazySynchronized().property

    @Benchmark
    fun publicationLazy(): String = LazyPublication().property

    @Benchmark
    fun noneLazy(): String = LazyNone().property

}

class LazyNone {
    val property by lazy(LazyThreadSafetyMode.NONE) { "Some irrelevant value" }
}

class LazySynchronized {
    val property by lazy(LazyThreadSafetyMode.SYNCHRONIZED) { "Some irrelevant value" }
}

class LazyPublication {
    val property by lazy(LazyThreadSafetyMode.PUBLICATION) { "Some irrelevant value" }
}
