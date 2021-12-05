const val ONE = 1

fun main() {
    val topRange = readLine()!!.toInt()
    var sumOfNums = 0

    for (i in ONE..topRange) {
        val nextNum = readLine()!!.toInt()
        sumOfNums += nextNum
    }

    println(sumOfNums)
}