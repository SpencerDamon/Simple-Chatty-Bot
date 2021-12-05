fun main() {
    var num = readLine()!!.toInt()
    var counter = 0

    while (num != 0) {
        counter++
        num = readLine()!!.toInt()
    }

    println(counter)
}