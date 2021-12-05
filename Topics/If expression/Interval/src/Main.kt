const val NEG_FIFTEEN = -15
const val TWELVE = 12
const val FOURTEEN = 14
const val SEVENTEEN = 17
const val NINETEEN = 19
fun main() {
    val num = readLine()!!.toInt()
    println(
        if (num > NEG_FIFTEEN && num <= TWELVE || num > FOURTEEN && num < SEVENTEEN || num >= NINETEEN) "True" else "False")
}
