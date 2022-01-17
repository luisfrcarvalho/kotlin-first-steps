fun main (args: Array<String>) { // From Kotlin v1.3 you can omit main's parameters
    println("Hello world!")
    val a = 1 // The value will be constant
    var b = 2 // The value may change

    // Variables
    var c: Boolean = false // Explicit declaration
    var d: Int = 3
    var e = d.toLong() // e type is inferred

    // Arrays
    var f: Array<Int> = arrayOf(1,2,3)
    var g = arrayOf("1",2 ,3)
    for(item: Int in f) {
        println(item)
    }
    for(item in g) {
        println(item)
    }
}