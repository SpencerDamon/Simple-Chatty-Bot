fun main() {
    var num = readLine()!!.toInt()
    val oddEven = num % 2
    if (oddEven == 0) {
        num += 2
    } else {
        num += 1
    }
    println(num)
}
