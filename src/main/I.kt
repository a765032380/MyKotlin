package main
class I : Man() {

    fun I(name:String,age:Int,birthday:String,gender:String){
        this.age=age
        this.name=name
        this.birthday=birthday
        this.gender=gender


    }

    override fun eatFood() {
        println("我正在吃饭")
    }

    override fun goToBed() {
        println("我正在睡觉")
    }

    override fun playDoug() {
        println("我正在打豆豆")
    }


}