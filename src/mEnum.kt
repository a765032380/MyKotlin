enum class Week{
    Monday,         //星期一
    Tuesday,        //星期二
    Wednesday,      //星期三
    Thursday,       //星期四
    Friday,         //星期五
    Saturday,       //星期六
    Sunday          //星期天
}

fun main(args: Array<String>) {
    for(e in Week.values()){
        println("Week.values=$e")
        println("Week.values=${e.name}")
    }
    println(Week.Wednesday)//ordinal枚举的序列，从0开始  name 枚举的名称
}