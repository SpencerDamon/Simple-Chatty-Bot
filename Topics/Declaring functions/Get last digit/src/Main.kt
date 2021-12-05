const val LAST_DIGIT = 10
fun getLastDigit(a: Int): Int {
    return kotlin.math.abs(a % LAST_DIGIT)
}

/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}