const val TWO = 2
const val THREE = 3
const val FIVE = 5
const val SIX = 6
fun main() {
    val num = readLine()!!.toInt()
    if (num % TWO == 0) println("Divided by 2")
    if (num % THREE == 0) println("Divided by 3")
    if (num % FIVE == 0) println("Divided by 5")
    if (num % SIX == 0) println("Divided by 6")
}