class Car {
    var brand = ""
    var model = ""
    var year = 0
}
class Cars(var brand: String, var model: String, var year: Int)
fun main(){
    // Create a c1 object of the Car class
    val c1 = Car()
    val c2 = Cars("Range Rover", "Mustanga", 1969)
// Access the properties and add some values to it
    c1.brand = "Ford"
    c1.model = "Mustang"
    c1.year = 1969

    println(c1.brand)   // Outputs Ford
    println(c1.model)   // Outputs Mustang
    println(c1.year)    // Outputs 1969
    println(c2.brand)   // Outputs Ford
    println(c2.model)   // Outputs Mustang
}
