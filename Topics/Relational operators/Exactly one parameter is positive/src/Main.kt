fun main() {
    val num1 = readLine()!!.toInt()
    val num2 = readLine()!!.toInt()
    val num3 = readLine()!!.toInt()
    val onePos = num1 < 1 && num2 < 1 && num3 >= 1
    val twoPos = num1 < 1 && num2 >= 1 && num3 < 1
    val threePos = num1 >= 1 && num2 < 1 && num3 < 1
    val onlyOnePos = onePos || twoPos || threePos
    println(onlyOnePos)
}