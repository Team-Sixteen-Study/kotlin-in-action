package org.example.ch04

/*
// 4.3.1. 모든 클래스가 정의해야하는 메서드
class Client(val name: String, val postalCode: Int) {
    override fun toString() = "Client(name=${name}, postalCode=${postalCode})"
    override fun equals(other: Any?): Boolean {
        if(other == null || other !is Client) {
            return false
        }
        return name == other.name &&
                postalCode == other.postalCode
        }

    override fun hashCode(): Int = name.hashCode() * 31 + postalCode
}*/
/**
 * 4.3.2. data 클래스를 정의하여, 모든 메서드를 자동 생성
 */
data class Client(val name: String, val postalCode: Int)
