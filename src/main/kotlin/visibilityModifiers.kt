class Orang(private var name: String) {
    //untuk dapat mengakses propertinya harus menambahkan fungsi getter dan setter

    fun getName(): String {
        return name
    }

    fun setName(newName: String) {
        name = newName
    }
}

fun main() {
    val ophi = Orang("Ophi")
    println(ophi.getName())

    ophi.setName("Dwi")
    println(ophi.getName())
//  println(ophi.name) //properti name tidak dapat di akses karena bersifat private
}

/*
Protected
open class Animal(val name: String, protected val weight: Double)

class Cat(pName: String, pWeight: Double) : Animal(pName, pWeight)

val cat = Cat("Dicoding Miaw", 2.0)
    println("Nama Kucing: ${cat.name}")
    println("Berat Kucing: ${cat.weight}") //Cannot access 'weight': it is protected in 'Cat'

Internal
internal class Animal(val name: String)
 */