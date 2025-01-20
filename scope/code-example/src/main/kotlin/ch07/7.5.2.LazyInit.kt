package org.example.ch07

class Email{}
fun loadEmails(user: Users) : List<Email> {
    println("${user.name} 의 이메일을 가져옴")
    return listOf()
}

// 7.17 지연 초기화를 뒷받침하는 프로퍼티를 통해 구현
/*class Users (val name: String) {
    private var _emails: List<Email>? = null // 데이터를 저장하고 email 에 위임 객체 역할을 하는 _email 프로퍼티
    val emails: List<Email>
        get() {
            if(_emails == null) {
                _emails = loadEmails(this) // 최초 접근 시 이메일을 가져온다.
            }

            return _emails!! // 저장해 둔 데이터가 있으면 그 데이터를 반환한다.
        }
}*/
// 7.17 지연 초기화를 위임 프로퍼티를 통해 구현(lazy 함수 사용)
class Users(val name: String) {
    val emails by lazy { loadEmails(this) }
}

fun main() {
    val user = Users("jkcho")
    user.emails // 최초로 emails 를 읽을 떄 딱 한번만 이메일을 가져옴
    user.emails
    user.emails
    user.emails
    user.emails
}