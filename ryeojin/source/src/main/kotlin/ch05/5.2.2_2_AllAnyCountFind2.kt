package ch05.AllAnyCountFind2

fun main() {
    val list = listOf(1, 2, 3)
    println(!list.all { it == 3 })
    println(list.any { it != 3})
}