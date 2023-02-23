package com.jnasifcoding.practise

import org.funktionale.collections.destructured

fun functional(){
    val (head, tail) = listOf(1,2,3)
    println("Head = $head and tail = $tail")
}

fun main(){
    functional()
}

