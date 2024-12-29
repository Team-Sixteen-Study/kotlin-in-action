package ch04.ImplementingPropertiesDeclaredInInterfaces2

interface User {
    val email: String
    val nickname: String
        get() = email.substringBefore('@')
}