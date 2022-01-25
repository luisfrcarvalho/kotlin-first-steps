package inheritance

abstract class AnimalAbstractClass {
    // Being an abstract class means that nobody can create any objects of that type,
    // even if you've defined a constructor for it.

    // You can initialize abstract properties, or define a custom getter or setter for it,
    // the compiler will refuse it. Abstract classes don't store state.
    abstract val image: String
    abstract val food: String
    abstract val habitat: String

    abstract fun makeNoise()
    abstract fun eat()

    open fun roam() {
        println("The animal is roaming!")
    }

    open fun sleep() {
        println("The animal is sleeping!")
    }
}

abstract class Canine : AnimalAbstractClass() {
    final override fun roam() {
        super.roam()
        println("The inheritance.Canine is roaming!")
    }
}

class DogV2(override val image: String, override val food: String, override val habitat: String) : Canine() {
    override fun makeNoise() {
        println("inheritance.Dog making a noise!")
    }

    override fun eat() {
        println("inheritance.Dog making eating!")
    }

    override fun sleep() {
        super.sleep()
        println("The dog is sleeping!");
    }
}