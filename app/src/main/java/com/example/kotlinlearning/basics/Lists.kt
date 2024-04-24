package com.example.kotlinlearning.basics

fun main () {

    //List declaration. By default, lists are immutable
    val school = listOf("Goldfish", "Clownfish", "Salmon")
    println(school)

    //Explicit type declaration of list
    val explicit: List<String> = listOf("Hello", "World", "!")
    println(explicit)

    //Mutable list
    val fish = mutableListOf("Shark", "Tuna")
    fish.remove("Shark")
    println(fish)


}