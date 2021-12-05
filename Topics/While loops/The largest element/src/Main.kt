fun main() {
    var num: Int
    var sum = 0

    do {
        num = readLine()!!.toInt()
        if (num > sum) { sum = num }

    } while (num != 0)

    println(sum)
}