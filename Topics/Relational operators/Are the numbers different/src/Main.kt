fun main() {
    val num1 = readLine()!!.toInt()
    val num2 = readLine()!!.toInt()
    val num3 = readLine()!!.toInt()
    val differentNum = num1 != num2 && num2 != num3 && num1 != num3
    println(differentNum)
}