fun myFunction(fname: String, age: Int) {
    println(fname + " is " + age)
}
fun myFunctions(x: Int): Int {
    return (x + 5)
}
// A function with two Int parameters, and Int return type
fun myFunctin(x: Int, y: Int): Int {
    return (x + y)
}


fun main() {
    myFunction("John", 35)
    myFunction("Jane", 32)
    myFunction("George", 15)

    var result = myFunctions(3)
    println(result)
    var results = myFunctin(3,5)
    println(results)
}
