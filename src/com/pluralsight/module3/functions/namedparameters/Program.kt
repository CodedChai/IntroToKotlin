package com.pluralsight.module3.functions.namedparameters

fun main(args: Array<String>) {
    log( logLevel = 2, message ="Hello world")
}

@JvmOverloads
fun log(message: String, logLevel: Int = 1) {
    println(message + logLevel)
}