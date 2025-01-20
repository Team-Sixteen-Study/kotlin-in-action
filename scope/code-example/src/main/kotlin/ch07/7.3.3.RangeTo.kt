package org.example.ch07

import java.time.LocalDate

fun main() {
    val now = LocalDate.now()
    val vacation = now..now.plusDays(10) // 범위를 만든다
    println(now.plusWeeks(1) in vacation) // 특정 날짜가 날짜 범위 안에 들어가는지 검사
}