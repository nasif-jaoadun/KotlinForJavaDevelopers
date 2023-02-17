package main.kotlin

fun main(args: Array<String>){
    val smallerInt: Int = findSmaller(23,52)
    val smallerLong: Long = findSmaller(123456789L,999999999L)
    val smallerByte: Byte = findSmaller((-127).toByte(),(127).toByte())
    val smallerString: String = findSmaller("Beta","Alpha")


    println(smallerInt)
    println(smallerLong)
    println(smallerByte)
    println(smallerString)
}

fun <T: Comparable<T>>findSmaller(param1: T, param2: T): T{
    val results = param1.compareTo(param2)
    return if(results<0) param1 else param2
}