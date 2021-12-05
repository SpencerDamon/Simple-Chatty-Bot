fun main() {
    val range = readLine()!!.toInt()..readLine()!!.toInt()
    val n = readLine()!!.toInt()
    var counter = 0

    for (i in range) {
        if (i % n == 0) counter ++
    }
    println(counter)
}