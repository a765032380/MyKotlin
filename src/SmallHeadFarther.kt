class SmallHeadFarther:IWashHowl by BigHeadSon() {
    override fun washing() {
        println("我是小头爸爸，我一次赚10块钱")
        BigHeadSon().washing()
        println("我在看着我儿子洗碗")
    }
}