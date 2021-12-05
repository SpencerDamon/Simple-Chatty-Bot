const val WEEKENDLOW = 15
const val WEEKENDHIGH = 25
const val WEEKDAYLOW = 10
const val WEEKDAYHIGH = 20
fun main() {
    val reeces = readLine()!!.toInt()
    val weekend = readLine()!!.toBoolean()
    val success = if (weekend == true) {
        reeces >= WEEKENDLOW && reeces <= WEEKENDHIGH
    } else { 
        reeces >= WEEKDAYLOW && reeces <= WEEKDAYHIGH
    }
    println(success)
}
