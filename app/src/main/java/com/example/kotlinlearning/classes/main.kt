package com.example.kotlinlearning.classes

fun buildAquarium() {
    val myAquarium = Aquarium(width = 25, length = 25, height = 40)
    myAquarium.printSize()
    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()
}

fun main () {
//    buildAquarium()

    makeFish()
}

fun makeFish() {
    val shark = Shark()
    val pleco = Pleco()

    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}

object Animal {
    val color: String = "Black"
    val name: String = "Panther"
    val legs: String = ""
    val tail: String = ""
    val fur: String = ""
}

data class AnimalData(
    val color: String = "Black",
    val name: String = "Panther",
    val legs: String = "",
    val tail: String = "",
    val fur: String = ""
)