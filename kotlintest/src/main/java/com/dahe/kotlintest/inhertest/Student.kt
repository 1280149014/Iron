package com.dahe.kotlintest.inhertest

/**
 * author : charile yuan
 * date   : 20-12-4
 * desc   :
 */
class Student(name : String, age :Int,var no : String,var score : Int ) : Person(name,age) {


    override fun study() {
//        super.study()
        println("我上大学了")
    }

}


fun main(args: Array<String>){
    var s = Student("Alice",12,"123",120);
    println("" + s.age)
    println("" + s.name)
    println("" + s.no)
    println("" + s.score)
    s.study()
}

