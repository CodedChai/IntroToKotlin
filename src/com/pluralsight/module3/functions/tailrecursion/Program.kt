package com.pluralsight.module3.functions.tailrecursion

import java.math.BigInteger

// Kotlin will basically optimize the recursion away and turn it into a loop

fun main(args: Array<String>){
    println(fib(1000000))
}

tailrec fun fib(n: Int, a: BigInteger = BigInteger("1"), b: BigInteger = BigInteger("0")) : BigInteger {
    return if(n ==0 ) b else fib(n-1, a+b, a)
}