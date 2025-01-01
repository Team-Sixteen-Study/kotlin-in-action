package org.example.ch04

/**
 * 4.2.3. 인퍼테이스에 게터와 세터가 있는 프로퍼티를 선언할 수도 있다
 */
interface User5 {
    val email: String
    val nickname: String
        get() = email.substringBefore('@') // 프로퍼티에 뒷받침하는 필드가 없다.대신 매번 결과를 계산해 돌려준다.
}