class Animal(
    val name: String, //properti
    val weight: Double,
    val age: Int,
    val isMammal: Boolean //Primary constructor
) {
    fun eat() { //fungsi
        println("$name makan!")
    }

    fun sleep() {
        println("$name tidur!")
    }
}

class Car{
    var name: String = "Homda"
        get(){
            println("Fungsi Getter terpanggil")
            return field
        }
        set(value){
            println("Fungsi Setter terpanggil")
            field = value
        }
}


fun main() {
    val cat = Animal("Mengki",2.3,2,true) //membuat objek
    println("Nama: ${cat.name}, Berat: ${cat.weight}, Umur: ${cat.age}, Mamalia: ${cat.isMammal}")

    cat.eat()
    cat.sleep()

    val honda = Car()
    println("Nama: ${honda.name}" )
    honda.name = "Jazz"
    println("Nama: ${honda.name}")
}