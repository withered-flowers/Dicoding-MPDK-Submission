package com.witheredflowers.mpdk.tugas02.kotlinfundamental.latihan03

fun main() {
    val valueA = 65
    val valueB = 52
    val valueC = 78

    val result = calculate(valueA, valueB, valueC)

    println(result)
}

fun calculate(valueA: Int, valueB: Int, valueC: Int?): Any = generateResult(valueA + (valueB - (valueC ?: 100)))

fun generateResult(result: Int) = "Result is $result"