package ch04.CompanionObjects1

import ch04.ImplementingPropertiesDeclaredInInterfaces.getFacebookName

class User private constructor(val nickname: String) {
    companion object {
        fun newSubscribingUser(email: String) =
            User(email.substringBefore('@'))
        fun newFacebookUser(accountId: Int) =
            User(getFacebookName(accountId))
    }
}

fun main() {
    val subscribingUser = User.newSubscribingUser("bob@gmail.com")
    val facebookUser = User.newFacebookUser(4)
    println(subscribingUser.nickname)
}