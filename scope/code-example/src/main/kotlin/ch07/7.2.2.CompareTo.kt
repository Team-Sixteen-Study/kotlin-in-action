package org.example.ch07

class People (
    val firstName: String, val lastName: String
) : Comparable<People> {
    override fun compareTo(other: People): Int {
        // 인자로 받은 함수를 차례로 호출하며 값을 비교
        return compareValuesBy(this, other, People::lastName, People::firstName)
    }
}

fun main() {
    val p1 = People("Alice", "Smith")
    val p2 = People("Bob", "Johnson")
    println(p1 < p2)
}