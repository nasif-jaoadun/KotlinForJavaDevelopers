fun main(args: Array<String>){
    println("Hello World")

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