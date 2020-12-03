package com.dahe.kotlintest

import kotlin.properties.Delegates

/**
 * author : charile yuan
 * date   : 20-12-2
 * desc   :observable 可以用于实现观察者模式。
Delegates.observable() 函数接受两个参数: 第一个是初始化值, 第二个是属性值变化事件的响应器(handler)。
在属性赋值后会执行事件的响应器(handler)，它有三个参数：被赋值的属性、旧值和新值：

 *
 */
class Observable {
    var name: String by Delegates.observable("初始值") {
            prop, old, new ->
        println("旧值：$old -> 新值：$new")
    }

}
fun main(args: Array<String>) {
    val user = Observable()
    user.name = "第一次赋值"
    user.name = "第二次赋值"
}