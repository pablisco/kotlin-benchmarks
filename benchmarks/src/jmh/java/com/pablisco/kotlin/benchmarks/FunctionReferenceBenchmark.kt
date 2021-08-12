package com.pablisco.kotlin.benchmarks

import org.openjdk.jmh.annotations.*

open class FunctionReferenceBenchmark {

    @Benchmark
    fun lambda() {
        calculate { increment(it) }
    }

    @Benchmark
    fun reference() {
        calculate(::increment)
    }

}

fun increment(value: Int): Int = value + 1

fun calculate(block: (Int) -> Int): Int = increment(10)