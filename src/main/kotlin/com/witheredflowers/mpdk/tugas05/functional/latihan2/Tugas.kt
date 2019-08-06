package com.witheredflowers.mpdk.tugas05.functional.latihan2

fun main() {
    val result = multiply(300, 300)

    println(result)
}

val multiply:  (Int, Int) -> Int = { value1, value2 -> value1 * value2 }