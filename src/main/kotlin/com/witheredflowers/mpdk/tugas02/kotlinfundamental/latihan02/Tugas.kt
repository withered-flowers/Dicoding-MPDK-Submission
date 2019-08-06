package com.witheredflowers.mpdk.tugas02.kotlinfundamental.latihan02

fun main() {
    val resultMultiple = multiple(10, 10)
    val resultSum = sum(10, 10)

    println(resultMultiple)
    println(resultSum)
}

fun multiple(i: Int, i1: Int): Int = i * i1

fun sum(i: Int, i1: Int): Int = i + i1