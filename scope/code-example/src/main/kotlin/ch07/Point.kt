package org.example.ch07

data class Point(val x: Int, val y: Int) {
    //7.2.1. equals 메서드를 직접 구현
    override fun equals(obj: Any?): Boolean {
        if (obj === this) return true
        if (obj !is Point) return false
        return obj.x == x && obj.y == y
    }
}
fun main() {
    println(Point(10,20) == Point(10,20))
}