package org.example.ch07

operator fun Rectangle.contains(p: Point) : Boolean {
    // 범위를 만들고 x 좌표가 그 범위 안에 있는지 검사
    // until 함수를 사용해 열린 범위를 만듬
    return p.x in upperLeft.y until lowerRight.x &&
    p.y in upperLeft.y until lowerRight.y
}

fun main() {
    val rect = Rectangle(Point(10,20) , Point(50,50))
    println(Point(20,30) in rect)
    println(Point(5,5) in rect)
}