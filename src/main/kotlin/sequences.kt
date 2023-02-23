package com.jnasifcoding.practise

fun sequences(){
    val students = getStudents()
    val sqsStudents = students.drop(1).take(3).toList()
    println("Sequenced students: $sqsStudents")

    val numbers = generateSequence (100) { it+1 }
    println("numbers; ${numbers.drop(5).take(20).toList()}")

    val squares = generateSequence(1) {it+1}.map { it + it }
    val evenSquares = squares.filter { it % 2 == 0 }
    println("Even squares : ${evenSquares.take(5).toList()}")

    val fib = generateSequence(1 to 1) { it.second to it.first + it.second }.map { it.first }
    println("fibonacci: ${fib.take(15).toList()}")
}

fun main(){
    sequences()
}
