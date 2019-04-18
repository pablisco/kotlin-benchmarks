package com.pablisco.kotlin.benchmarks

import org.openjdk.jmh.annotations.*

open class ForLoopBenchmark {

    @Benchmark
    fun loopFor() {
        for (i in 0 until numberOfIterations) { doSomething() }
    }

    @Benchmark
    fun loopForEach() {
        (0 until numberOfIterations).forEach { _ -> doSomething() }
    }

    @Benchmark
    fun loopForEachIndexed() {
        (0 until numberOfIterations).forEachIndexed { _, _ -> doSomething() }
    }

}

private const val numberOfIterations = 10_000

private fun doSomething() {

}
