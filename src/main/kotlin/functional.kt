package com.jnasifcoding.practise

import org.funktionale.composition.compose
import org.funktionale.composition.forwardCompose
import org.funktionale.currying.*
import org.funktionale.partials.partially1
import org.funktionale.partials.partially3
import org.funktionale.memoization.memoize
//import org.funktionale.playground.m.timeElapsed

fun functional(){
    val (head, tail) = listOf(1,2,3)
    println("Head = $head and tail = $tail")

    val add5 = {i: Int -> i + 5}
    val multiplyBy2 = {i: Int -> i*2}
    val multiplyBy2andAdd5 = add5 compose multiplyBy2 // compose keyword combine the two function by using the result of the second function as the parameters for the first function
    val composeResults = multiplyBy2andAdd5(10)
    println("multiplyBy2andAdd5(10) = $composeResults")

    val add5andMultiplyBy2 = add5 forwardCompose multiplyBy2 // the forwardCompose method applies the functions in the opposite order, it uses the results of the first function as the parameter of the second
    val forwardComposeResult = add5andMultiplyBy2(10)
    println("add5andMultiplyBy2 = $forwardComposeResult")

    val sum3ints = {x: Int, y: Int, z:Int -> x + y + z }
    val curried: (Int) -> (Int) -> (Int) -> Int = sum3ints.curried()
    val cur = curried(2)(4)(6)
    println("curried(2)(4)(6) - $cur")

    val prefixAndPostfix: (String, String, String) -> String =
        {prefix: String, x: String, postfix: String -> "{$prefix}{$x}{$postfix}"}
    val prefixAndBang: (String, String, String) -> String = prefixAndPostfix.partially3("!")
    val hello: (String) -> String = prefixAndBang.partially1("Hello, ")
    println(hello("Functionale"))
}

fun memo() {
    var fibonacci: (Long) -> Long = {it}
    fibonacci = {n: Long ->
        if(n<2) n else fibonacci(n-1)+ fibonacci(n-2)
    }
    var m: (Long) -> Long = {it}
    m = {n: Long ->
        if(n<2) n else m(n-1)+m(n-2)
    }.memoize()

    println("calling fib: + ${timeElapsed { fibonacci(40) }} + ms ")
    println("calling memoize version: ${timeElapsed { m(40) }} ms ")
}

fun timeElapsed(body: () -> Unit): Long{
    val start = System.currentTimeMillis()
    body()
    val end = System.currentTimeMillis()
    return end - start
}

fun main(){
    //functional()

    memo()
}

