const val ONEHUNDRED = 100
const val TEN = 10
fun main() {
    val num = readLine()!!.toInt()
    val hundredsToOnes = num / ONEHUNDRED
    val tenthsPlace = num % ONEHUNDRED / TEN * TEN
    val onesToHundreds = num % TEN * ONEHUNDRED
    println(onesToHundreds + tenthsPlace + hundredsToOnes)
}
