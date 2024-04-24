package com.example.kotlinlearning.newlearning

fun main() {
    val user: User? = User("Adam", "Sand", "dummy@email.com")

    // LET
    user?.let {
        println(it)
    }

    // APPLY
//    user?.firstName = "Black"
//    user?.lastName = "Panther"
//    user?.email = "new@email.com"
    user?.apply {
        firstName = "Black"
        lastName = "Panther"
        email = "new@email.com"
    }.also {
        println(user)
    }

    //With & Run
    user?.run {
        firstName.toString()
    }

    with(user) {
        println(this?.firstName?.capitalizeEverything())
    }


}

data class User(var firstName: String, var lastName: String, var email: String)