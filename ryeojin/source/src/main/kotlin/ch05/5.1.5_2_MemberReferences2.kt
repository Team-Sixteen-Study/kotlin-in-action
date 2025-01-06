package ch05.MemberReferences2

data class Person(val name: String, val age: Int)

fun Person.isAdult() = age >= 21

fun main() {
    val createPerson = ::Person
    val p = createPerson("Alice", 29)
    println(p)

    val predicate = Person::isAdult
    println(predicate(p))
}