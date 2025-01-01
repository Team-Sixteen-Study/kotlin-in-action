package org.example.ch04

class SubscribingUser(val email : String) : User4 {
    override val nickname: String // 커스텀 게터
        get() = email.substringBefore('@')
}