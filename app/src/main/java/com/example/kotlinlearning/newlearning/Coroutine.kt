package com.example.kotlinlearning.newlearning

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

suspend fun main() {
    //Scope
    //Dispatcher
    //Run mode -> to start

    GlobalScope.launch {
        println("Global Scope Starting. . .")
        delay(1000L) // blocking the thread for 1 sec
        println("Hello World!")
        println("Global thread is ${Thread.currentThread().name}")
    }

    val job = GlobalScope.async {
        println("Global Scope Starting. . .")
        delay(1000L) // blocking the thread for 1 sec
        println("Hello World!")
        println("Global thread is ${Thread.currentThread().name}")
    }

    job.await()

    println("Out in the wild!")
    println("Current thread is ${Thread.currentThread().name}")

    runBlocking {
        println("Run Blocking Starting. . .")
        delay(2000L) // blocking the thread for 2 sec
        println("Bye World!")
        println("RunBlocking thread is ${Thread.currentThread().name}")
    }

}