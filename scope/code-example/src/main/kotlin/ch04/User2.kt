package org.example.ch04

class User2 (_nickname: String) { // 주 생성자
    // 다음 처럼 초기화 코드를 프로퍼티 선언에 포함 시키면 초기화 블록 생략이 가능.
    val nickname = _nickname;
}