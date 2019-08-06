package com.witheredflowers.mpdk.tugas04.dataclass.latihan2
fun main() {
    val user = mapOf(
        "name" to "John",
        "age" to 23,
        "address" to "St. Petersburg"
    )

    val name = user.getValue("name")
    val age = user.getValue("age")
    val address = user.getValue("address")

    println(
        """User
            |Name: $name
            |Age: $age
            |Address: $address"""
        .trimMargin()
    )
}