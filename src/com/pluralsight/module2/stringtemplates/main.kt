package com.pluralsight.module2.stringtemplates

fun main(args: Array<String>){
    val q = Question()

    println(q.Question)

    q.Answer = "Connor"

    q.display()

    println("The answer is ${q.Answer}")

}

class Question {
    var Answer: String = ""
    val Question: String = "What's your name?"

    fun display() {
        println("You said: $Answer")
    }
}