package ch06.NullabilityOfTypeParameters

fun <T> printHashCode(t: T) {
    println(t?.hashCode())
}

fun main() {
    printHashCode(null)
}