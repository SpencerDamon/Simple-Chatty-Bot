const val TWENTY = 20
fun main() {
    val numA = readLine()!!.toInt()
    val numB = readLine()!!.toInt()
    val numC = readLine()!!.toInt()
    val twenty = numA + numB == TWENTY || numA + numC == TWENTY || numB + numC == TWENTY
    println(twenty)
}