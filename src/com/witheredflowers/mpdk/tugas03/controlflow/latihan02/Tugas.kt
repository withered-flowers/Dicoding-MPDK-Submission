package com.witheredflowers.mpdk.tugas03.controlflow.latihan02

fun main() {
    val range = 1.rangeTo(100) step 10

    for (i in range) {
        println("$i x 10 = ${i * 10}")
    }
}