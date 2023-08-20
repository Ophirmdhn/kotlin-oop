//parent class
open class Animall(val name: String, val weight: Double, val age: Int, val isCarnivore: Boolean)  {
    open fun eat() {
        println("$name sedang makan!")
    }

    open fun sleep() {
        println("$name sedang tidur!")
    }
}

//child class
class Catt(pName: String, pWeight: Double, pAge: Int, pIsCarnivore: Boolean, val furColor: String, val numberOfFeet: Int)
    : Animall(pName, pWeight, pAge, pIsCarnivore) { //melakukan extend pada kelas Animall

    fun playWithHuman() {
        println("$name bermain bersama Manusia !")
    }

    override fun eat(){
        println("$name sedang memakan ikan !")
    }

    override fun sleep() {
        println("$name sedang tidur di bantal !")
    }
}

fun main() {
    val ophiCat = Catt("Mengki", 2.3, 2, true, "Orens", 4)

    println(
        """
            Nama : ${ophiCat.name},
            Berat : ${ophiCat.weight},
            Umur : ${ophiCat.age},
            Karnivora : ${ophiCat.isCarnivore}
            Warna: ${ophiCat.furColor},
            Jumlah Kaki : ${ophiCat.numberOfFeet}
            
        """.trimIndent()
    )
    ophiCat.playWithHuman()
    ophiCat.eat()
    ophiCat.sleep()
}