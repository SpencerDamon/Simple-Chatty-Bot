const val ONEHUNDRED = 100
const val TEN = 10
fun main() {
    val num = readLine()!!.toInt()
    val sum = num / ONEHUNDRED + num / TEN % TEN + num % TEN
    println(sum)
}
