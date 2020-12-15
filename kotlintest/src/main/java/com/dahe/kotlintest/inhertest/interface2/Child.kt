package com.dahe.kotlintest.inhertest.interface2

/**
 * author : charile yuan
 * date   : 20-12-4
 * desc   :
 */
class Child:MyInteface1 {
    override var name: String
        get() = "runoob"
        set(value) {}

    override fun bar() {
        println("bar")
    }
}
fun main(args: Array<String>){
    var c = Child()
    c.bar()
    println(c.name)
}