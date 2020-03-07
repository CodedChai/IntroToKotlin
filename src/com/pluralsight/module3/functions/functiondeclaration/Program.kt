package com.pluralsight.module3.functions.functiondeclaration

fun main(args: Array<String>) {
    display("Hello world")
    println(max(69, 420))
}

fun display(message: String): Boolean {
    println(message)

    return true
}

fun max(a: Int, b: Int): Int = if (a > b) a else b

