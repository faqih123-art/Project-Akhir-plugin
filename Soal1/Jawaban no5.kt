class no5(val name: String, val umur: Int, val Hobi: String,val address: String) {
    fun <T> sayHello(param: T) {
        println("Hallo $param Perkenalkan nama saya adalah $name, umur saya $umur, hobi saya adalah $Hobi, " +
                "dan saya tinggal di $address.")

    }
}

fun main() {
    val person = no5("Azmi", 18, "sepak bola", "tegal")
    person.sayHello("Semua")
}
