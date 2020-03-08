@file:JvmName("DisplayFunctions")
package com.pluralsight.module3.functions.defaultparameters

fun main(args: Array<String>) {
    log("Hello world", 2)
    log("Hello world")

}

@JvmOverloads
fun log(message: String, logLevel: Int = 1) {
    println(message + logLevel)

}