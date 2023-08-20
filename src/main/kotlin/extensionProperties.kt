class Anim(var name: String, var weight: Double, var age: Int, var isMammal: Boolean)

val Anim.getAnimalInfo : String
    get() =  "Nama: ${this.name}, Berat: ${this.weight}, Umur: ${this.age} Mamalia: ${this.isMammal}"

fun main() {
    val cat = Anim("Mengki", 5.0, 2, true)
    println(cat.getAnimalInfo)
}