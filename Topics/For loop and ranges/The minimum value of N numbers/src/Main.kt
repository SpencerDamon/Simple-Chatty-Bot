const val MIN_END_POINT = 1

fun main() {
    val range = MIN_END_POINT..readLine()!!.toInt()
    var minNum = Int.MAX_VALUE

    for (i in range) {
        val nextNum = readLine()!!.toInt()
        if (nextNum < minNum) minNum = nextNum
    }

    println(minNum)
}
