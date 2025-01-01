package org.example.ch04

class User constructor(_nickname: String) { // 주 생성자

    val nickname: String

    init { // 초기화 블록.
        nickname = _nickname
    }
}