package com.pluralsight.module3.functions.extensionfunctions

fun main(args: Array<String>){
    val text = "With     multiple \t whitespace"
    println(strip(text))
    println(text.stripEx())
}

fun strip(text: String) : String {
    var regex = Regex("\\s+")
    return regex.replace(text, " ")
}

fun String.stripEx() : String {
    var regex = Regex("\\s+")
    return regex.replace(this, " ")
}