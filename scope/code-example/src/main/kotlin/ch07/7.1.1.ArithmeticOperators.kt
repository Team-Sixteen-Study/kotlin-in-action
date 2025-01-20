package org.example.ch07

// 7.2. plus 라는 이름의 확장함수를 정의
operator fun Point.plus(other: Point) : Point {
    return Point(x + other.x, y + other.y)
}

// 7.3. 두 피연산자의 타입이 다른 연산자 정의
operator fun Point.times(scale: Double) : Point {
    return Point((x * scale).toInt() , (y * scale).toInt())
}

// 7.4. 결과 타입이 피연산자 타입과 다른 연산자 정의
operator fun Char.times(count: Int) : String {
    return toString().repeat(count)
}

fun main() {
    val p1 = Point(10,20)
    val p2 = Point(30, 40)
    println(p1 + p2) // a.plus(b) 로 컴파일 된다.
    println(p1 * 1.5) // a.times(scale)
    println('a' * 3)
}