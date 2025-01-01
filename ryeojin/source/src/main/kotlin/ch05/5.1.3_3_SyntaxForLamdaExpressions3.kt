package ch05.SyntaxForLambdaExpressions3

data class Person(val name: String, val age:Int)

fun main() {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    println(people.maxBy { it.age })
    println(people.maxBy ({ p:Person -> p.age }))
    println(people.maxBy() { p:Person -> p.age })
    println(people.maxBy { p:Person -> p.age })
}