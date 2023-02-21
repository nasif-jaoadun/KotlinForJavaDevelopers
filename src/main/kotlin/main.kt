package com.jnasifcoding.practise

import main.java.com.jnasifcoding.practise.Animal


object MySingleton {
    var temperatures = arrayOf(80, 73, 90)
    fun getLastTemperature() = temperatures.last()
}

fun javaInterOp(){
    val tom = Animal("Tom","cat", 10)
    println(tom.show())
    val guddu = Animal("Guddu", "dog", 30)
    println(guddu.show())

    guddu.weight =34
    println(guddu.show())

    //guddu.kind = "Elephent"

}

fun useOverLoad(){
    val p1 = Position(200,800)
    val p2 = Position(1000, 2000)
    val p3 = p1+p2
    println(p3)
}

fun main(args: Array<String>){
    println("Hello World")

    val Tanvir = Person("Tanvir","Ahmed")
    useOverLoad()

    javaInterOp()

    val maxInt: Int = max(42, 88)
    val maxLong: Long = max(123456789L, 999999999L)
    val maxByte: Byte = max((-128).toByte(), (127).toByte())
    val maxString: String = max("Beta","Alpha")

    println("The max Int = $maxInt")
    println("The max Long = $maxLong")
    println("The max Byte = $maxByte")
    println("The max String = $maxString")

    val me = Person("S M", "Nasif")
    val brother = Person("S M", "Sakib", "Ahsanus")

    val location = object {
        var xPosition = 200
        var yPosition = 400
    }
    println("position = ${location.xPosition} , ${location.yPosition}")

    val newLocation = object {
        var xPosition = 200
        var yPosition = 400
        fun printIt(){
            println("This is also the same position: $xPosition , $yPosition")
        }
    }
    newLocation.printIt()
    newLocation.xPosition = 3000
    newLocation.yPosition = 4000
    newLocation.printIt()

    val temperature = MySingleton.getLastTemperature()
    println("Last reading = $temperature degree")

    val myCar = Car()
    myCar.go()
    println("My car's make= ${myCar.MakeName}")
    return

    //val is immutable, like final variable in java, it is thread safe and good to be used
    //var is mutable, it is the normal use of variable in java

    val aSentence = "I'm a string" // no need to be define type if initialized
    val myPi = 3.14
    val myAnswer = 42

    var aString: String // only needs when not initialized
    val aDouble: Double
    val aInt: Int

    var myDouble= 1.999
    var myFloat = 1.9f
    var myLong = 123123123L
    var myInt = 199
    var myShort: Short = 12
    var myByte: Byte = 127

    val aLongNumber = 123_456_789 //underscore is kind of comma separated, only to use readable
    val theSameNumber = 123456789

    val anInt: Int = 1
    val aLong: Long = anInt.toLong() // explicit or implicit both need to be converted


    //int lowest = (a>b)? a:b; //alternative of this expression in Kotlin

    val lowest = if(myInt < anInt) myInt else anInt //when if uses as expression it must contains an else. The expression must have a value in all cases
    println("the lowest value is $lowest")

    val temp = 88
    val isAirConditionerOn = if(temp>=80){
        println("it is worm")
        true
    }else{
        println("It is not so warm")
        false
    }
    println("Is the air conditioner on?: $isAirConditionerOn")

    val burgersOrdered = 2

    when(burgersOrdered){
        0 -> println("Not hungry")
        1,2 -> println("Hungry")
        3 -> println("Very Hungry")
        else -> {
            println("Are you sure?")
        }
    }

    when(burgersOrdered){
        Math.abs(burgersOrdered) -> println("ordered 0 or more burgers")
        else -> {
            println("ordered less than 0")
        }
    }

    when(burgersOrdered){
        0 -> println("We need orders")
        in 1..4 -> println("Got Some orders")
        in 5..9 -> println("Business is up")
        else -> {
            println("Not sure")
        }
    }

    when{
        burgersOrdered <= 0 -> println("Name ordered")
        burgersOrdered % 2 == 1 -> println("Odd number ordered")
        burgersOrdered % 2 == 0 -> println("Even number ordered")
    }

    var x=0
    while (x<10){
        println("x = $x")
        x+=3
    }

    do {
        println("x= $x")
        x-=2
    }while (x>0)


    for (item in 1..10){
        print("$item, ")
    }

    for (ch in "biscuit"){
        print("$ch, ")
    }

    println()
    var ndx = 0
    for(item in 10.rangeTo(20).step(2)){
        print("${++ndx} $item, ")
    }
    println()

    for((index, item) in 10.rangeTo(20).step(2).withIndex()){
        print("${index+1} $item, ")
    }
    println()

    val myArray = arrayOf(10, 20, 30, 40, 50, 60)
    for(item in myArray.indices){ // as myArray doesn't have its own iterator here indices is the iterator and gives the index number here
        println("At index = $item is ${myArray[item]}")
    }
    println()

    println("10 + 20 = ${myFunction(10,20)}")
    println("10 + 20 = ${myFunction1(10,20)}")
    println("10 + 20 = ${myFunction2(10,20)}")

    myDefaults(10,20)
    myDefaults(10,20, "Hello")
    myDefaults(10)
    myDefaults(param2 = 20)
    myDefaults(message = "Greetings")
    myDefaults(10, message = "Hola")
    myDefaults(param2 = 20, message = "Hajimemashte")

}

fun myFunction(param1: Int, param2: Int): Int{
    return param1+param2
}

fun myFunction1(param1: Int, param2: Int): Int = param1+param2

fun myFunction2(param1: Int, param2: Int) = param1+param2

fun myDefaults(param1: Int = 1, param2 : Int = 2, message: String = "hi"): Int{
    println("Message = $message")
    return param1+param2
}

// I am a Comment

/*
    I am a comment too
*/

/*
fun meaningLessFun(){
    /*
        I am also a comment
    */

}
*/