package org.example.ch07

fun main() {
    val numbers = ArrayList<Int>()
    numbers += 42  // 변경 가능한 컬렉션에 원소를 추가
    println(numbers[0])

    val list = arrayListOf(1,2)
    list += 3 // += 를 통해 "list" 가 변경된다
    val newList = list + listOf(4,5) // + 는 두 리스트의 모든 원소를 포함하는 새로운 리스트를 반환한다.
    println(list)
    println(newList)
}