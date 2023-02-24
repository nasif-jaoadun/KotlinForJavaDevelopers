package com.jnasifcoding.practise

data class Student(val name: String, val roll: Int)

fun getStudents(): List<Student>{
    return listOf(Student("Nasif", 31),
        Student("Inam", 1),
        Student("Sonet", 2),
        Student("Fahad", 3),
        Student("Sajib", 4),
        Student("Shohag", 6),
        Student("Tonmoy", 9),
        Student("Rakib", 12),
        Student("Rasel", 17),
        Student("Rumi", 5),
        Student("Joni", 27),
        Student("Polok", 39)
    )
}

fun main(){
    val students = getStudents()
    val combos = students.map { a -> a.name + " : " + a.roll}
    println("Combos: " + combos)

    println("The worst student is: ${students.maxBy { it.roll }}")

    val studentsWithLongNames = students.filter { it.name.length > 5 }
    println("Long names: "+ studentsWithLongNames)

    val studentsWithShortNames = students.filter { it.name.length < 5 }
    println("Long names: "+ studentsWithShortNames)

    val shortestName = students.minBy { it.name.length }
    if(shortestName!= null){
        val studentWithShortName = students.filter { it.name.length == shortestName.name.length }
        println("Short name : $studentWithShortName")
    }
}

