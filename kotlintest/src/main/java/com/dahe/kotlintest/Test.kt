package com.dahe.kotlintest

import kotlin.properties.Delegates

/**
 * author : charile yuan
 * date   : 20-12-2
 * desc   :
 */
class Test {

    class Site(val map: MutableMap<String, Any?>) {
        val name: String by map
        val url: String by map
    }

    var notNullBar: String by Delegates.notNull<String>()

    fun example(computeFoo: () -> Test) {
        val memoizedFoo by lazy(computeFoo)

    }

}
fun main(args: Array<String>) {

    val a: Int = 10000
    println(a === a) // true，值相等，对象地址相等

    //经过了装箱，创建了两个不同的对象
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a

    //虽然经过了装箱，但是值是相等的，都是10000
    println(boxedA === anotherBoxedA) //  false，值相等，对象地址不一样
    println(boxedA == anotherBoxedA) // true，值相等

    val b: Byte = 1 // OK, 字面值是静态检测的
    val i: Int = b.toInt() // 错误

    var x = 0
    if(x>0){
        println("x 大于 0")
    }else if(x==0){
        println("x 等于 0")
    }else{
        println("x 小于 0")
    }

    var c = 1
    var d = 2
    val e = if (a>=b) c else d
    println("c 的值为 $e")

    val items = setOf("apple", "banana", "kiwi")
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }
}
