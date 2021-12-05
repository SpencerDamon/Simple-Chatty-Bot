const val COUNTER_RESET_VAL = 1
const val START_RANGE = 1

fun main() {
    val range = START_RANGE..readLine()!!.toInt()
    var longestIntSeq = 0
    var num = 0
    var tempCounter = 0

    for (i in range) {
        val nextNum = readLine()!!.toInt()
        if (nextNum >= num) {
            tempCounter++
            num = nextNum
        } else if (tempCounter > longestIntSeq) {
            longestIntSeq = tempCounter
            num = nextNum
            tempCounter = COUNTER_RESET_VAL
        } else {
            num = nextNum
            tempCounter = COUNTER_RESET_VAL
        }
    }

    /*  This if after the for loop is needed to include the last sequence
        in the counter when evaluating against the stored count. */
    if (tempCounter > longestIntSeq) {
        longestIntSeq = tempCounter
    }

    println(longestIntSeq)
}