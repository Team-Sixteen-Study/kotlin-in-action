package org.example.ch07

import java.math.BigDecimal

// 7.5. 단항 연산자 정의
operator fun Point.unaryMinus() : Point {
    return Point(-x,-y)
}

// 7.6. 증가 연산자 정의
operator fun BigDecimal.inc() = this + BigDecimal.ONE

fun main() {
    val p = Point(10,20)
    println(-p)

    var bd = BigDecimal.ZERO
    println(bd++) // 후위 연산은 현재 bd 값을 반환한 다음에 bd 값을 증가
    println(bd)
    println(++bd) // 전위 연산은 즉시
}