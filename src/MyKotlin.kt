import java.util.*

fun main(args: Array<String>) {
    text()

}
fun text(){

    var classThree=ClassThree("classThree")
    println(classThree.a)
    println("Hello World")//打印Hello World
    val mString="mString"//定义一个变量
    println(mString)    //打印定义的变量
    val greeter=Greeter("World!") //相当于 new一个对象 不需要new关键词了
    greeter.greet()  //调用对象的无参方法
    println(greeter.sum(12,15))  //调用对象的有参方法，并打印返回结果
    println(greeter.sum1(13,15)) //调用对象的有参方法，并打印返回结果
    greeter.vars(1,2,3,4,5,6,7)   //调用对象的有参不限长度的方法
    println(greeter.sumLambda(1,2))   //调用对象的Lambda，并打印返回结果
    println(greeter.mLambda("Kotlin","Kotlin"))  //调用对象的Lambda，并打印返回结果
    println(checkAge(9))   //打印判断结果
    println(checkAge(22))  //打印判断结果
    gradeStudent(10)  //类似JAVA switch
    println(max(10,8)) //打印判断两个数大的结果
    println(aInb(13,10,11,12))  //判断一个数是否在另一个数的区间里
    whenIn(11)      //判断一个数在那个区间中
    forArray()
    loop()
    mList()
    mMap()
    mLambda()
    mReadLine()
    mInterFace()
    mIWashHowl()
}
/**
 *
 */
fun mIWashHowl(){
    val son=BigHeadSon()
    son.washing()

    val farther=SmallHeadFarther()
    farther.washing()


}

/**
 * 接口
 */
fun mInterFace(){
    val iMan=Man()
    iMan.iInterFace("实现接口内容")
}
/**
 * ReadLine
 * 从控制台获取用户输入的数据
 */
fun mReadLine(){
    var num1:Int
    var num2:Int
    println("请输入第一个数字")
    while (true) {
         try {
             num1 =readLine()!!.toInt()
            break
        } catch (e: Exception) {
            println("请输入第一个数字")
            continue
        }
    }

    println("请输入第二个数字")
    while (true) {
        try {
            num2 =readLine()!!.toInt()
            break
        } catch (e: Exception) {
            println("请输入第二个数字")
            continue
        }
    }

    println("$num1+$num2=${num1 + num2 }")
}



/***
 * Lambda
 * Lambda表达式，可以简化函数的写法
 */
fun mLambda(){
    val i={x:Int,y:Int -> x+y}
    val result1=i(3,5)
    println(result1)

    val j:(Int,Int)->Int={x,y -> x+y}
    val result2=j(3,5)
    println(result2)
}


/**
 * List
 */
fun mList(){
    val lists = listOf("鸡蛋","大米","冰淇淋")

    for(list in lists){
        println("$list \t")
    }
    for ((i,e) in lists.withIndex()){
        println("$i ..\t.. $e")
    }
}
/**
 * Map
 */
fun mMap(){
    val map = TreeMap<String,String>()
    map["好"]="good"
    map["学习"]="study"
    map["天天"]="day"
    map["向上"]="up"
    for (map1 in map.keys){
        println(map1)
    }

}


/**
 * 区间和循环
 */
fun loop(){
    val numS=1..10
    for (num in numS){
        print("$num \t")
    }
    //以步长为2的方式打印，
    for (num in numS step 2){
        print("$num \t")
    }
    numS.reversed()//反转（也就倒叙）
    numS.count()//序列中的总数

}


/**
 * 判断输入的年龄是否大于18
 */
fun checkAge(age:Int):Boolean{
    return age >= 18
}

/**
 * 类似JAVA switch
 */
fun gradeStudent(score:Int){
    when(score){
        10 -> println("考了满分，棒棒哒")
        9  -> println("干得不错")
        8  -> println("还可以")
        7  -> println("还需要努力")
        6  -> println("刚好及格")
        else -> println("需要加油哦~！")
    }
}

/**
 * 判断一个数在那个区间中
 */
fun whenIn(a:Int){
    when(a){
        in 1..10->println("该数值在1到10之间")
        in 11..20->println("该数值在11到20之间")
    }
}

/**
 * 获取两个数中较大的那个
 */
fun max(a:Int,b:Int):Int{
    return if (a>b) a else b
}

/**
 * 判断一个数是否在另一个数的区间里
 */
fun aInb(a:Int,vararg b:Int):Boolean{
    return a in b
}

/**
 * 迭代器
 *
 * item 相当于list.get(i)  String 类型   items 数据源
 */
fun forArray(){
    val items = listOf("apple","banana","kiwi")
    for (item : String in items){
        println(item)
    }
    for (index in items.indices){//循环数组脚标
        println("item at $index is ${items[index]}")
    }
}
class Greeter(private val name:String){
    fun greet(){
        println("Hello,$name")
    }
    /**
     * 求两个数的和
     */
    fun sum(a :Int ,b:Int):Int{
        return a+b
    }

    /**
     * 求两个数的和，简化写法
     */
    fun sum1(a:Int ,b:Int)=a+b

    /**
     * 接收一个长度可变的类型，并依次打印出来
     */
    fun vars(vararg v:Int){
        for (vt in v) {
            println(vt)
        }
    }
    /**
     * Lambda表达式的写法
     */
    var sumLambda:(Int,Int)->Int={x,y->x+y}
    var mLambda:(String,String)->String={
        x,y->"$x*******$y"
    }
}
data class ClassThree(var a:String)