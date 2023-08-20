package com.ophi

interface IFlyy {
    fun fly()
    val numberOfWing: Int
}

fun flyWithWing(bird: IFlyy){
    bird.fly()
}

fun main() {
    flyWithWing(object : IFlyy { //bisa langsung mendefinisikan isi dari kelas
        override fun fly() {
            if(numberOfWing > 0) println("Yawdah terbang pake $numberOfWing sayap")
            else println("Gabisa terbang, minimal ada sayap lah")
        }

        override val numberOfWing: Int
            get() = 2
    })
}