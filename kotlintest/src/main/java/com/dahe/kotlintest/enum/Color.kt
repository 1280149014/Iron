package com.dahe.kotlintest.enum

/**
 * author : charile yuan
 * date   : 20-12-22
 * desc   :
 */
enum class Color {
    RED,BLACK,BLUE,GREEN,WHITE
}

inline fun <reified T : Enum<T>> printAllValues() {
    print(enumValues<T>().joinToString { it.name })
}


fun main(args: Array<String>) {
    var color:Color=Color.BLUE

    println(Color.values())
    println(Color.valueOf("RED"))
    println(color.name)
    println(color.ordinal)

    printAllValues<Color>() // 输出 RED, GREEN, BLUE
}