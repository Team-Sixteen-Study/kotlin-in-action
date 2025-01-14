package ch06.Arrays4

fun main() {
    val squares = IntArray(5) { i -> (i+1) * (i+1) }
    println("squares.joinToString() = ${squares.joinToString()}")
}