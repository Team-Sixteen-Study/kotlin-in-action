package org.example.ch04

/**
 * 4.2.1. 해당 클래스의 유일한 생성자를 비공개로 처리(외부에서 인스턴스화 할 수없음)
 */
class Secretive private constructor(){ // 동반 객체 안에서 비공개 생성자를 호출하면 좋은 경우가 있다.
}