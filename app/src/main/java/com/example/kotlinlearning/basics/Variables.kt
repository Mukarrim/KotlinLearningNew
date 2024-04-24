package com.example.kotlinlearning.basics

import com.example.kotlinlearning.classes.AnimalData

// Usually is assigned as property
lateinit var something: AnimalData

fun main() {

    //Initializing a variable with different types
    var string1: String = "Hello World"

//    var userData: AnimalData

    val newThing: String by lazy {
        "A value that is assigned already"
    }

    if (::something.isInitialized) println(something)
    println(newThing)
//    println(userData.color)
    // println(something.color)

    // 5,1,2,3,1,2,1,5,6,7,1
    val users = listOf<String>(
        "Michael",
        "Morgan"
    )
    val userUpdate = mutableListOf<String>(
        "Michael",
        "Morgan"
    )

    userUpdate.forEach {

    }
    val userSet = setOf<String>(
        "Michael",
        "Morgan",
        "Morgan",
        "Michael",
        "Sheldon"
    )
    println("The user SET is $userSet")
    val userUpdateSet = mutableSetOf<String>(
        "Michael",
        "Morgan"
    )
    userUpdateSet.add("Michael")
    userUpdateSet.add("Sheldon")
    userUpdateSet.add("Michael")
    userUpdateSet.add("Morgan")
    println("Mutable SET is $userUpdateSet")

    userUpdate.add("Sheldon")

    val studentGrade = mapOf(
        Pair("Hamza", 4),
        Pair("Maksudul", 5),
        Pair("Morgan", 6),
        Pair("Alwaleed", 4),
        Pair("Hamza", 7),
    )

    println("The output of MAP is $studentGrade")

    var num1: Int = 123

    var num2: Int = 321

    //String template
    val string = "num1 is ${num1}, num2 is ${num2}"
    println(string)

    //Var variables can be reassigned while val variables can not
    num1 = num2

    println("Num1 is reassigned to num2 ${num1}")


}

