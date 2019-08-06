package com.witheredflowers.mpdk.tugas05.functional.latihan1

fun main() {
    val text = "Kotlin".getFirstAndLast()

    val firstChar = text["first"]
    val lastChar = text["last"]

    println(firstChar)
    println(lastChar)

}

fun String.getFirstAndLast() = mapOf(
    "first" to this.first(),
    "last" to this.last()
)