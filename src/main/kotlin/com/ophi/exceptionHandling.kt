package com.ophi

fun main() {
    val someNullValue: String? = null
    lateinit var someMustNotNullValue: String

    try {
        someMustNotNullValue = someNullValue!!
    } catch (e: Exception) { // jika terjadi exception program akan menjalankan blok catch
        someMustNotNullValue = "Nilai String Null"
        //println(someMustNotNullValue)
    } finally { //optional
        println(someMustNotNullValue)
    }

    val someStringValue: String? = null
    var someIntValue: Int = 0

    try {
        someIntValue = someStringValue!!.toInt()
    } catch (e: NullPointerException) {
        someIntValue = 0
    } catch (e: NumberFormatException) {
        someIntValue = -1
    } finally {
        when(someIntValue){
            0 -> println("Catch block NullPointerException terpanggil !")
            -1 -> println("Catch block NumberFormatException terpanggil !")
            else -> println(someIntValue)
        }
    }
}
