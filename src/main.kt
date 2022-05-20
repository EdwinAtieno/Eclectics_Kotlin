fun main() {
    fun myFirtFunction(){
        val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
        println(cars[0])
        cars[0]="range rover"
        println(cars.size)
        if ("Volvo" in cars) {
            println("It exists!")
        } else {
            println("It does not exist.")
        }
        for (x in cars) {
            println(x)
        }
        for (chars in 'a'..'x') {
            println(chars)
        }
        for (nums in 5..15) {
            if (nums == 10) {
                continue
            }
            println(nums)
        }
    }
    myFirtFunction()
    myFirtFunction()
    myFirtFunction()


}
