package com.witheredflowers.mpdk.tugas05.functional.latihan3

fun main() {
    val text = formatText("Kotlin is Awesome")

    val lowerCase = text["lowerCase"]
    val upperCase = text["upperCase"]

    println(lowerCase)
    println(upperCase)

}

fun formatText(text: String) = with(text){
    mapOf(
        "lowerCase" to this.toLowerCase(),
        "upperCase" to this.toUpperCase()
    )
}