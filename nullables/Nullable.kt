package nullables

import inheritance.Animal

class Nullable {

    var str: String? = "Pizza"

    var animal: Animal? = Animal("name", 25)

    fun makeNoise() {
        // animal.makeNoise() won't compile because we cannot guarantee that some other code updated `animal`
        animal?.makeNoise() // safe call operator
    }

    fun printStr() {
        println(str ?: "STR is null!") // ?: Elvis operator
    }

    fun printStrWithLet() {
        // alternative approach to if(str != null).
        // .let allows you to run code for a value that's not null.
        str?.let { println(it) }
    }
}

fun main(args: Array<String>) {
    val value1 = Nullable()
    value1.str = null;
    value1.printStr();

    var n: Nullable? = null
    n?.printStr() // this means that printStr() is only called if n is not null.
}