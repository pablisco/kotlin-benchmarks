# kotlin-benchmarks

[![Build Status](https://github.com/pablisco/kotlin-benchmarks/actions/workflows/main.yml/badge.svg)](https://github.com/pablisco/kotlin-benchmarks/actions)
[![Results](https://img.shields.io/badge/JMH-Results-green.svg)](https://pablisco.com/kotlin-benchmarks/)

A place to bench kotlin features and their options.

Tests so far:

 - `by lazy`: Comparing all three threading options
 - String formatting: Comparing the various options available to concatenate and format strings
 - For Loop: Comparing `for(i in range)`, `range.forEach {  }` and `range.forEachIndexed {}`
