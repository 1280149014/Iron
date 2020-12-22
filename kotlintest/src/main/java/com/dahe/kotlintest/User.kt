package com.dahe.kotlintest

/**
 * author : charile yuan
 * date   : 20-12-22
 * desc   :
 */
class User(val name: String, val age : Int) {

    fun copy(name: String = this.name,age:Int = this.age) = User(name,age)

}

fun main(args:Array<String>){
    val jack = User(name = "jack", age = 1);
    val olderJack = jack.copy(age = 2)
    println(jack)
    println(olderJack)
}

