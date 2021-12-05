fun main() {
    val range1 = readLine()!!.toInt()..readLine()!!.toInt()
    val range2 = readLine()!!.toInt()..readLine()!!.toInt()
    val num1 = readLine()!!.toInt()
    println(num1 in range1 || num1 in range2)
}
