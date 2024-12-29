package ch04.DataClassCopy

data class Client(val name: String, val postalCode: Int)

fun main() {
    val bob = Client("Bob", 973293)
    println(bob.copy(postalCode = 382555))
}