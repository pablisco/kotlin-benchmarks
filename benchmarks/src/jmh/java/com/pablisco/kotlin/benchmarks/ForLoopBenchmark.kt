package com.pablisco.kotlin.benchmarks

import org.openjdk.jmh.annotations.*
import org.openjdk.jmh.infra.Blackhole
import org.openjdk.jmh.annotations.OperationsPerInvocation

open class ForLoopBenchmark {

    @Benchmark
    @OperationsPerInvocation(numberOfIterations)
    fun loopFor(blackhole: Blackhole) {
        for (i in 0 until numberOfIterations) { blackhole.consume(true) }
    }

    @Benchmark
    @OperationsPerInvocation(numberOfIterations)
    fun loopForEach(blackhole: Blackhole) {
        (0 until numberOfIterations).forEach { _ -> blackhole.consume(true) }
    }

    @Benchmark
    @OperationsPerInvocation(numberOfIterations)
    fun loopForEachIndexed(blackhole: Blackhole) {
        (0 until numberOfIterations).forEachIndexed { _, _ -> blackhole.consume(true) }
    }

}

private const val numberOfIterations = 1_000
