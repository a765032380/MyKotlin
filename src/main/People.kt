package main

abstract class People {
    /**
     * 性别
     */
    var gender:String = ""
    /**
     * 姓名
     */
    var name:String = ""
    /**
     * 年龄
     */
    var age:Int = 0
    /**
     * 生日
     */
    var birthday:String = ""

    /**
     * 吃饭的抽象方法
     */
    abstract fun eatFood()

    /**
     * 睡觉的抽象方法
     */
    abstract fun goToBed()

    /**
     * 打豆豆的方法
     */
    abstract fun playDoug()



}