package com.pablisco.kotlin.benchmarks

import kotlin.LazyThreadSafetyMode.*

class LazyNone {
    val property by lazy(NONE) { "Some irrelevant value" }
}

class LazySynchronized {
    val property by lazy(SYNCHRONIZED) { "Some irrelevant value" }
}

class LazyPublication {
    val property by lazy(PUBLICATION) { "Some irrelevant value" }
}