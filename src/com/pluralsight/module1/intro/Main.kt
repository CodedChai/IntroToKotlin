package com.pluralsight.module1.intro

fun main(args: Array<String>){
    println("Hello world")

    val kevin = Person("Kevin")

    kevin.display()

    kevin.Name = "Steve"

    kevin.display()

    kevin.displayWithLambda(::printName)
}

fun printName(name: String){
    println(name)
}