class Cat(name: String, color: String, age: Int) {
    val name: String
    val color: String
    val age: Int
    var reog: Boolean

    init {
        this.name = name
        this.color = color
        this.age = if (age < 0) 0 else age
        this.reog = false
    }

    //secondary constructor
    constructor(name: String, color: String, age: Int, reog: Boolean): this(name, color, age) {
        this.reog = reog
    }
}

fun main() {
    /*
    jika nilai reog tidak diisi maka primary constructor yang akan digunakan,
    dan nilai reog diambil dari nilai default yang ada pada blok init.

    ketika semua nilai diisi maka secondary constructor yang akan digunakan
     */

    //primary constructor
    val ophiCat = Cat("Mengki", "Orens", 2)
    println("Nama: ${ophiCat.name}, Warna: ${ophiCat.color}, Umur: ${ophiCat.age}, Reog? : ${ophiCat.reog}")

    //secondary constructor
    val catLain = Cat("Sumbul", "HITAM", 3, true)
    println("Nama: ${catLain.name}, Warna: ${catLain.color}, Umur: ${catLain.age}, Reog? : ${catLain.reog}")

    //deafult constructor
    val meong = Kucing()
    println("Nama: ${meong.name}, Warna: ${meong.color}, Umur: ${meong.age}, Reog? : ${meong.reog}")
}

//default constructor
class Kucing {
    val name: String = "Ismail Ahmad Kanabawi"
    val color: String = "Ireng"
    val age: Int = 2
    var reog: Boolean = true
}


