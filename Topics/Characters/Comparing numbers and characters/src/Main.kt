fun main() {
    val numChValue = readLine()!!.toInt()
    val ch = readLine()!!.first()

    val sameUniCode = numChValue.toChar() == ch
    println(sameUniCode)
}