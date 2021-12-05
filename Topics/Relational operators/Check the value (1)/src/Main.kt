const val TEN = 10
fun main() {
    val num = readLine()!!.toInt()
    val greater = num in 1 until TEN
    println(greater)
}