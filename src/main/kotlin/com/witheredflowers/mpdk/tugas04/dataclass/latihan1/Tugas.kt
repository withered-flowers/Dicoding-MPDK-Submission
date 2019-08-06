package com.witheredflowers.mpdk.tugas04.dataclass.latihan1

fun main() {
    val user = User("John", 23, "St. Petersburg")
    val newUser = user.copy()
    newUser.age=25
    newUser.address = "Saint Petersburg"

    println(
        """User
            |Name: ${user.name}
            |Age: ${user.age}
            |Address: ${user.address}
            |
            |New User
            |Name: ${newUser.name}
            |Age: ${newUser.age}
            |Address: ${newUser.address}
        """
        .trimMargin()
    )
}

data class User(val name: String, var age: Int, var address: String)