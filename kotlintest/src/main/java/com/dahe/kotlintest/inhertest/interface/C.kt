package com.dahe.kotlintest.inhertest.`interface`

/**
 * author : charile yuan
 * date   : 20-12-4
 * desc   :
 */
class C() : A() , B {


    override fun fun1() {

        super<A>.fun1()
        super<B>.fun1()
    }
}

fun main(args : Array<String>){
    var c = C()
    c.fun1();
}