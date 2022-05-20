fun myFunction(fname: String, age: Int) {
    println(fname + " is " + age)
}
fun myFunctions(x: Int): Int {
    return (x + 5)
}

fun main() {
    myFunction("John", 35)
    myFunction("Jane", 32)
    myFunction("George", 15)

    var result = myFunctions(3)
    println(result)
}
