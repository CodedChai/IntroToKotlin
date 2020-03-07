package com.pluralsight.module2.gettingstarted.branching

fun main(args: Array<String>){
    val q = Question()

    println(q.Question)

    q.Answer = "Sasuke"

    q.display()

    println("The answer is ${q.CorrectAnswer}")

    val message = if(q.Answer == q.CorrectAnswer) {
        "You got it dude!"
    } else {
        "Try again"
    }

    println(message)
}

class Question {
    var Answer: String = ""
    val CorrectAnswer = "Sasuke"
    val Question: String = "Who am I?"

    fun display() {
        println("You said: $Answer")
    }
}
