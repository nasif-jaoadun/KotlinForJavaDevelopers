package com.jnasifcoding.practise

class Point(val x: Int, val y: Int, val z: Int){
    operator fun component1(): Int = x
    operator fun component2(): Int = y
    operator fun component3(): Int = z
}

