fun main() {
    val class1 = readLine()!!.toInt()
    val class2 = readLine()!!.toInt()
    val class3 = readLine()!!.toInt()
    val desks1 = class1 / 2 + class1 % 2
    val desks2 = class2 / 2 + class2 % 2
    val desks3 = class3 / 2 + class3 % 2
    val totalDesks = desks1 + desks2 + desks3
    println(totalDesks)
}
