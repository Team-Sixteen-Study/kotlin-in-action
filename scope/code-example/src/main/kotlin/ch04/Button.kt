package org.example.ch04

open class Button : Clickable { // 4.2.1. 인터페이스는 생성자가 없어, 인터페이스 이름 뒤에는 괄호가없다.
    override fun click() {
        println("I was clicked"); // java 8과 마찬가지로 다음과 같은 디폴트 메서드는 재정의하지 않아도 사용이 가능

    }
}