package data

// Data classes must not be open or abstract
data class Recipe(val title: String, val isVegeratian: Boolean, var difficulty: String = "easy") {
    // A data class is one that lets you create objects whose main purpose is to store data.
    // It includes features that are helpful when you're dealing with data.
    // They automatically override the equals function that checks whether two data objects hold the same property values.
}

fun main(args: Array<String>) {
    val value1 = Recipe("recipe 1", false)
    val value2 = Recipe("recipe 1", false)

    val valueWithoutDefaultValue = Recipe("recipe 1", false, "difficult")

    println(value1 == value2)
    // Equal data objects return the same hashcode and toString
    println("Hashcode: " + (value1.hashCode() == value2.hashCode()))
    println("ToString:" + (value1.toString() == value2.toString()))

    // The copy function lets you copy a data object, altering some of its properties.
    // The original object remains the same.
    val value3 = value1.copy(title = "recipe 3")
    println(value3)

    // Destructuring a data object
    val value4 = value1.component1()
    val value5 = value1.component2()
    // val value5 = value1.componentN()

    // == -> checks for object equivalence
    // === -> checks for object identity
    println("==: " + (value1 == value2))
    println("===: " + (value1 === value2))
}