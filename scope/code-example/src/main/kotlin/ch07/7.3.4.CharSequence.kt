package org.example.ch07

// 직접 CharSequence에 대한 iterator 확장 함수 만들기
operator fun CharSequence.iterator(): CharIterator = object : CharIterator() {
    private var index = 0

    override fun hasNext(): Boolean = index < length
    override fun nextChar(): Char = get(index++)
}

fun main() {
    val text: CharSequence = "Kotlin for CharSequence"

    for (c in text) {
        println(c)
    }
}

