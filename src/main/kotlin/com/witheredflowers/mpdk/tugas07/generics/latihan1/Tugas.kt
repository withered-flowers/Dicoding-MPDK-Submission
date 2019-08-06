package com.witheredflowers.mpdk.tugas07.generics.latihan1

fun main() {
    val stringResult = getResult("Kotlin")
    val intResult = getResult(100)

    println(stringResult)
    println(intResult)
}

fun <T> getResult (args: T): Int {
    return when (args) {
        is String -> args.length
        is Int -> args * 5
        else -> 0
    }
}