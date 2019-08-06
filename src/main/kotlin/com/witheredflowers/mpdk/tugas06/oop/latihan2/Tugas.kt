package com.witheredflowers.mpdk.tugas06.oop.latihan2

open class Vehicle(val color: String, val wheel: Int, val maxSpeed: Int)

//class Motorcycle (val maxSpeed: Int)
class Motorcycle : Vehicle("Blue", 2, 120)

class Car : Vehicle("Red", 4, 250)

fun main() {
    val car = Car()

    with(car) {
        println(color)
        println(wheel)
        println(maxSpeed)
    }

    val motor = Motorcycle()
    println()

    with(motor) {
        println(color)
        println(wheel)
        println(maxSpeed)
    }
}