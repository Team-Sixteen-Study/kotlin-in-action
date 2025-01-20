package org.example.ch07

// 7.16 루프 변수에 구조분해 선언을 사용하여 맵 이터레이션
fun printEntries(map: Map<String,String>) {
    for ((key,value) in map) {
        println("$key -> $value")
    }
}

fun main() {
    val map = mapOf("oracle" to "java", "jetbrains" to "kotlin")
    printEntries(map)
}