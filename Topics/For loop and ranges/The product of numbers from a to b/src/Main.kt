const val ONE: Long = 1
fun main() {
    val num1 = readLine()!!.toLong()
    val num2 = readLine()!!.toLong()
    var num: Long = ONE

    for (j in num1 until num2) {
        num *= j
    }

    println(num)
}