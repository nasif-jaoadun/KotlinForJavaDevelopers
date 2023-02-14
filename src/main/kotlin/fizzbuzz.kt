package main.kotlin

fun main(args: Array<String>){
    println("FIzz......Buzz")
    for (index in 1..105){
        print("index $index")
        when{
            index % 15 == 0 -> print(" #FIZZBUZZ")
            index % 3 == 0 -> print(" #FIZZ")
            index % 5 == 0 -> print(" #BUZZ")
        }
        println()
    }
}

