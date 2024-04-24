package com.example.kotlinlearning.newlearning

fun main() {

    val circle = Circle(2.5)

    println("Circle's area is ${circle.area()}")

    println("Circle's perimeter is ${circle.perimeter()}")

    val name: String = "adam"
    println(name.capitalizeEverything())

}

// fun CLASS_NAME.FUNC_NAME(): RETURN_TYPE {}
fun Circle.perimeter() = 2 * Math.PI * radius
fun Circle.perimeterFalse() = 2 * Math.PI * radius * 5
fun String.capitalizeEverything() = this.capitalize()


// We cannot modify this class anymore. . . .
class Circle(val radius: Double) {
    fun area(): Double = Math.PI * radius * radius
}