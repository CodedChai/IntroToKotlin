package com.pluralsight.module1.intro

class Person  (var Name: String) {

    fun display(){
        println("Display: $Name")
    }

    fun displayWithLambda(func : (s:String) -> Unit){
        func(Name)
    }
}