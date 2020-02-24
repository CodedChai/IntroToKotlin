package com.pluralsight.module2.`when`

fun main(args: Array<String>){
    val q = Question()

    println(q.Question)

    q.Answer = "Sasuke"

    q.display()

    println("The answer is ${q.CorrectAnswer}")

    q.printResult()
}

class Question {
    var Answer: String = ""
    val CorrectAnswer = "Sasuke"
    val Question: String = "Who am I?"

    fun display() {
        println("You said: $Answer")
    }

    fun printResult(){
        when (Answer) {
            CorrectAnswer -> println("You got it dude!")
            else -> println("Try again")
        }
    }
}
