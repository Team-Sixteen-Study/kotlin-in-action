package ch03.creatingCollectionsInKotlin

val set = hashSetOf(1, 7, 53)
val list = arrayListOf(1, 7, 53)
val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

val strings = listOf("first", "second", "third")
val numbers = setOf(1, 14, 2)

fun main() {
    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)

    println(strings.last())
    println(numbers.max())
}