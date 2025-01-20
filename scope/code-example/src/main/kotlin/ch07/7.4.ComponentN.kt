package org.example.ch07

fun main() {
    val p = Point(10,20)
    val (x,y) = p // data 클래스의 구조 분해를 사용하면, 복합적인 값을 분해하여 여러 변수를 한번에 초기화가 가능
    println(x)
    println(y)
}