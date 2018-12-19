package com.pablisco.kotlin.benchmarks

import org.openjdk.jmh.annotations.*
import java.util.concurrent.TimeUnit

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
open class LazyBenchmark {

    @Benchmark
    fun synchronisedLazy() {
        checkNotNull(LazySynchronized().property)
    }

    @Benchmark
    fun publicationLazy() {
        checkNotNull(LazyPublication().property)
    }
    @Benchmark
    fun noneLazy() {
        checkNotNull(LazyNone().property)
    }

}
