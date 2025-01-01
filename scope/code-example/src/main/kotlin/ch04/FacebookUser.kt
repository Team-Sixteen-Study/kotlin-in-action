package org.example.ch04

/**
 * 4.2.3. 인터페이트의 프로퍼티 구현
 */
class FacebookUser(val accountId: Int) : User4 {
    override val nickname = getFacebookName(accountId); // 객체를 초기화하는 단계에 해당 메서드를 호출

    fun getFacebookName(accountId: Int): String {
        TODO("Not yet implemented")
    }
}