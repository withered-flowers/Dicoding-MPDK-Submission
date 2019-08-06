package com.witheredflowers.mpdk.tugas08.coroutines.latihan2

import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch {
        delay(6000)
        val result = 100 * 100
        println("Result: $result")
    }

    job.cancel()

    println("Membatalkan Job...")

    if (job.isCancelled) {
        println("Job dibatalkan")
    }
}