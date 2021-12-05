import kotlin.math.abs
fun main() {
    val (x1, y1) = readLine()!!.split(" ")
    val (x2, y2) = readLine()!!.split(" ")
    val x = abs(x2.toInt() - x1.toInt())
    val y = abs(y2.toInt() - y1.toInt())
    println(if (x1 == x2 || y1 == y2 || x == y) "YES" else "NO")
}
