package com.pablisco.kotlin.benchmarks

import org.openjdk.jmh.annotations.Benchmark
import java.lang.StringBuilder

open class StringFormatBenchmark {

    @Benchmark
    fun formatStringWithTemplate() {
        checkNotNull("Embed $subject")
    }

    @Benchmark
    fun formatStringWithStringFormat() {
        val template = "Embed %s"
        checkNotNull(String.format(template, subject))
    }

    @Suppress("ConvertToStringTemplate")
    @Benchmark
    fun formatStringWithConcatenation() {
        checkNotNull("Embed " + subject)
    }

    @Benchmark
    fun formatStringWithStringBuilder() {
        checkNotNull(StringBuilder("Embed ").append(subject))
    }

    @Benchmark
    fun formatStringWithStringBuffer() {
        checkNotNull(StringBuffer("Embed ").append(subject))
    }

}
open class StringFormatBenchmarkWithTwoSubjects {

    @Benchmark
    fun formatStringWithTemplate() {
        checkNotNull("Embed $subject $anotherSubject")
    }

    @Benchmark
    fun formatStringWithStringFormat() {
        val template = "Embed %s %s"
        checkNotNull(String.format(template, subject, anotherSubject))
    }

    @Suppress("ConvertToStringTemplate")
    @Benchmark
    fun formatStringWithConcatenation() {
        checkNotNull("Embed " + subject + " " + anotherSubject)
    }

    @Benchmark
    fun formatStringWithStringBuilder() {
        checkNotNull(StringBuilder("Embed ").append(subject).append(" ").append(anotherSubject))
    }

    @Benchmark
    fun formatStringWithStringBuffer() {
        checkNotNull(StringBuffer("Embed ").append(subject).append(" ").append(anotherSubject))
    }

}

private const val subject = "Subject"
private const val anotherSubject = "Another Subject"