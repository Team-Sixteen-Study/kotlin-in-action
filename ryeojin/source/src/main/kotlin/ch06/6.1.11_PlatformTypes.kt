package ch06.PlatformTypes

import ch06.Person

fun yellAt(person: Person) {
    println(person.name.toUpperCase() + "!!!")
}

fun yellAtSafe(person: Person) {
    println((person.name ?: "Anyone").toUpperCase() + "!!!")

}

fun main() {
    yellAtSafe(Person(null))
//    yellAt(Person(null))
}