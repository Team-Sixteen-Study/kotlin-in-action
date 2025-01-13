package ch06.NothingType

fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}

fun main() {
    fail("Error occurred")
}