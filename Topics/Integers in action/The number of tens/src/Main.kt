const val ONEHUNDRED = 100
const val TEN = 10
fun main() {
    val n = readLine()!!.toLong()
    println(n % ONEHUNDRED / TEN)
}
