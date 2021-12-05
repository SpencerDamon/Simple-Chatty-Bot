import kotlin.math.abs
const val ONE = 1
const val TWO = 2
fun main() {
    val (x1, y1) = readLine()!!.split(" ")
    val (x2, y2) = readLine()!!.split(" ")
    val y = abs(y2.toInt() - y1.toInt())
    val x = abs(x2.toInt() - x1.toInt())
    println(if (y == ONE && x == TWO || y == TWO && x == ONE) "YES" else "NO")
}