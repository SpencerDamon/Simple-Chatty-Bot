const val TEN = 10
fun main() {
    val num = readLine()!!.toInt()
    val lessTen = num < TEN
    println(lessTen)
}