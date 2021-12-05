const val FIVE = 5
const val THREE = 3

fun main() {
    val endPoint1 = readLine()!!.toInt()
    val endPoint2 = readLine()!!.toInt()
    val range = endPoint1..endPoint2

    for (i in range) {
        if (i % THREE == 0 && i % FIVE != 0) {
            println("Fizz")
        } else if (i % FIVE == 0 && i % THREE != 0) {
            println("Buzz")
        } else if (i % THREE == 0 && i % FIVE == 0) {
            println("FizzBuzz")
        } else {
            println(i)
        }
    }
}
