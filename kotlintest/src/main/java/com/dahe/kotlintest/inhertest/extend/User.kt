package com.dahe.kotlintest.inhertest.extend

/**
 * author : charile yuan
 * date   : 20-12-4
 * desc   :
 */
class User(var name:String) {
}

fun User.Print(){
    println("user print")
}


fun MutableList<Int>.swap(index1:Int, index2: Int){
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}

fun Any?.toString(): String{
    if(this == null) return "null"
    return toString()
}


fun main(args:Array<String>){
    var user =User("aaaa")
    user.Print()

    val l = mutableListOf<Int>(1,2,3)
    l.swap(0,2)
    println(l.toString())

    var t = null
    println(t.toString())
}





