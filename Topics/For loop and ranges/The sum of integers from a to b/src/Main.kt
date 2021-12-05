fun main() {
    val num1 = readLine()!!.toInt()
    val num2 = readLine()!!.toInt()
    var result = 0

    for (i in num1..num2) {
        result += i
    }

    println(result)
}