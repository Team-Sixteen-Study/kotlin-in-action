package ch02

class Person (
    val name: String, // 읽기 전용 프로퍼티
    var isMarried: Boolean // 게터, 세터를 만들어냄
)

fun main() {
    val person = Person("Bob", true)
    println(person.name)
    println(person.isMarried)

    person.isMarried = false
    println(person.isMarried)
}