package com.witheredflowers.mpdk.tugas02.kotlinfundamental.latihan01

fun main() {
    val now = 6
    val shopOpen = 7
    val shopClose = 17

    val shop = shopIsClose(now, shopOpen, shopClose)

    println("Shop is close : $shop")
}

fun shopIsClose(now: Int, shopOpen: Int, shopClose: Int) = now < shopOpen || now > shopClose