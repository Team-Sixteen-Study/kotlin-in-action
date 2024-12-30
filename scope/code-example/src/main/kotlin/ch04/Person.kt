package org.example.ch04

class Person(val name: String, val age: Int) {
    // 부 생성자
    constructor(name: String) : this(name, 0) {
        // 추가 초기화 코드
    }
}
