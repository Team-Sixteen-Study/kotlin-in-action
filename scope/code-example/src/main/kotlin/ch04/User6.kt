package org.example.ch04

/**
 * 4.2.4 세터에서 뒷받침하는 필드 접근하기
 */
class User6(val name: String) {
    var address: String = "unspecified"
        set(value: String) {
            println("""
                Address was changed for $name:
                "$field" -> "$value".""".trimIndent()) // 뒷받침하는 필드 값 읽기
            field = value // 뒷받침하는 필드 값 변경하기
        }
}