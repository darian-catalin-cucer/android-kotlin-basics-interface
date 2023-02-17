// Example of interface in Kotlin
interface Vehicle {
    fun start()
    fun stop()
}

class Car : Vehicle {
    override fun start() {
        println("Car starting")
    }

    override fun stop() {
        println("Car stopping")
    }
}

class Motorcycle : Vehicle {
    override fun start() {
        println("Motorcycle starting")
    }

    override fun stop() {
        println("Motorcycle stopping")
    }
}

fun main() {
    val car = Car()
    car.start()
    car.stop()

    val motorcycle = Motorcycle()
    motorcycle.start()
    motorcycle.stop()
}
