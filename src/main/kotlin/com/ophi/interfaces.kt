interface IFly { //membuat interface
    fun fly()
    val numberOfWing: Int //membuat properti
}

//untuk memanggil interface harus menggunakan extend dan override fungsi serta properti
class Bird(override val numberOfWing: Int) : IFly {
    override fun fly() {
        if (numberOfWing > 0) println("Yawdah terbang pake $numberOfWing sayap")
        else println("Gabisa terbang, minimal ada sayap lah")
    }
}

fun main() {
    val kiw = Bird(10)
    kiw.fly()
}