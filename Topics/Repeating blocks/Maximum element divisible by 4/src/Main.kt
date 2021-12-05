const val FOUR = 4
fun main() {
    val indexSize = readLine()!!.toInt()
    var divisibleByFour = 0

    repeat(indexSize) {
        val numInputs = readLine()!!.toInt()
        if (numInputs % FOUR == 0 && numInputs > divisibleByFour) {
            divisibleByFour = numInputs
        }
    }

    println(divisibleByFour)

}