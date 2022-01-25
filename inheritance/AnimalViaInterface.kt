package inheritance

interface Roamable {
    // Interfaces define a common protocol.
    // A clan can implement multiple interfaces, but can only inherit from a single direct superclass.
    // Interfaces provide the same benefits as using abstract classes, but with more flexibility.
    fun roam() {
        println("The Roamable is roaming!")
    }

    val velocity: Int
        get() = 20
        // set() can be defined here.
}

class AnimalViaInterface : Roamable {
    // If two classes  fail the IS-A test, this indicates that they probably
    // belong in the same superclass hierarchy.
    // When you have two classes that exhibit common behavior, you can model it using an interface.
    override fun roam() {
        println("The animal is roaming!")
    }

    override var velocity: Int = 50
}

class Vehicle : Roamable {
    // If two classes  fail the IS-A test, this indicates that they probably
    // belong in the same superclass hierarchy.
    // When you have two classes that exhibit common behavior, you can model it using an interface.
    override fun roam() {
        println("The vehicle is roaming!")
    }

    final override var velocity: Int = 200

    var isOverSpeedLimit = when(velocity) {
        in 100 .. Int.MAX_VALUE -> true
        else -> false
    }
}