package com.dahe.kotlintest.inhertest

/**
 * author : charile yuan
 * date   : 20-12-4
 * desc   :
 */
class Apple:Friut {

    constructor(name :String ,  age : Int ,  score : Int): super(name,age){
        println("bbbbbbbbbb")
        println("" + name)
        println("" + age)
        println("" + score)
    }
}

fun main(args: Array<String>){
   var apple = Apple("apple", 1, 12);
//    println()
}
