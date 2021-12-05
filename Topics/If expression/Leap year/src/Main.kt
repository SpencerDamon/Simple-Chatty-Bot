const val MIN_YEAR_RANGE = 1900
const val MAX_YEAR_RANGE = 3000
const val FOUR_HUNDRED = 400
const val ONE_HUNDRED = 100
const val FOUR = 4
fun main() {
    val year = readLine()!!.toInt()
    if (year > MIN_YEAR_RANGE && year < MAX_YEAR_RANGE) {
        if (year % ONE_HUNDRED != 0 && year % FOUR == 0 || year % FOUR_HUNDRED == 0) {
            println("Leap")
        } else {
            println("Regular")
        }
    }
}