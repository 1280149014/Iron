package com.dahe.kotlintest.generic

/**
 * author : charile yuan
 * date   : 20-12-22
 * desc   : 泛型
 */
class Box<T>(t:T) {
    var value = t

//    val box : Box<Int> = Box<Int>(1)
//    val box : Box(1)
}

fun main(args: Array<String>){
    var boxInt = Box<Int>(10)
    var boxString = Box<String>("Runoob")

    println(boxInt.value)
    println(boxString.value)

    val age = 23
    val name = "runoob"
    val bool = true

    doPrintln(age)
    doPrintln(name)
    doPrintln(bool)

    sort(listOf(1, 2, 3)) // OK。Int 是 Comparable<Int> 的子类型
//    sort(listOf(HashMap<Int, String>())) // 错误：HashMap<Int, String> 不是 Comparable<HashMap<Int, String>> 的子类型

}

fun <T> doPrintln(content: T){
    when(content){
        is Int -> println("整型数字为$content")
        is String -> println("字符串转换为大写: ${content.toUpperCase()}")
        else -> println("T 不是整型,也不是字符串")
    }
}

fun <T : Comparable<T>> sort(list: List<T>) {
    // ……
}



fun <T> copyWhenGreater(list: List<T>, threshold: T): List<String>
        where T : CharSequence,
              T : Comparable<T> {
    return list.filter { it > threshold }.map { it.toString() }
}



