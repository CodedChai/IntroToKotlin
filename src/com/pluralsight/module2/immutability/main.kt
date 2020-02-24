package com.pluralsight.module2.immutability

fun main(args: Array<String>){
    println("Hello world")

    // val makes it immutable, can't assign to it a second time
    val q = Question()
    // q = Question()

    q.Answer = "Connor"
    // q.Question = ""

}

class Question {
    var Answer: String = ""
    val Question: String = "What's your name?"
}