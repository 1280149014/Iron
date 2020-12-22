package com.dahe.kotlintest.generic

/**
 * author : charile yuan
 * date   : 20-12-22
 * desc   :
 */
class Runoob<out A> (val a:A){

    fun foo():A{
        return a
    }
}

fun main(args: Array<String>){
    var strCo: Runoob<String> = Runoob("a")
    var anyCo: Runoob<Any> = Runoob<Any>("b")

    anyCo = strCo
    println(anyCo.foo())
}


