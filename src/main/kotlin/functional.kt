package com.jnasifcoding.practise

import org.funktionale.collections.destructured
import org.funktionale.composition.compose
import org.funktionale.composition.forwardCompose

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
}

fun main(){
    functional()
}

