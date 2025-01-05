package ch05.FilterMap2

data class Person(val name: String, val age: Int)

fun main() {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    println(people.filter { it.age > 30 })
    println(people.map { it.name })
    println(people.map(Person::name))
}