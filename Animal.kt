// Classes are final by default, to use a class as a superclass, it must be declared as open.
// Everything you want to override must also be open.
open class Animal (open val name: String, open val weight: Int){
    // If you define a property in the superclass using ´val´, you must override it in the subclass.
    // If a superclass property has been defined using ´var´, you don't need to override it in the subclass,
    // as ´var´ variables can be reused for other values.

    open var sound: String = "Default sound!"

    open fun makeNoise() {
        println("The animal is making a noise!")
    }

    open fun eat() {
        println("The animal is eating!")
    }
}

class Dog(
    override val name: String,
    override val weight: Int, val food: String
    ) : Animal(name, weight){

    override var sound: String = "Ao ao!"

    override fun makeNoise() {
        super.makeNoise()
        println("$sound!")
    }

    override fun eat() {
        super.eat()
        println("The dog is eating $food!")
    }
}