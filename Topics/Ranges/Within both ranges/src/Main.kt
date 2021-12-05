fun main() {
    val numRange1 = readLine()!!.toInt()
    val numRange1a = readLine()!!.toInt()
    val numRange2 = readLine()!!.toInt()
    val numRange2a = readLine()!!.toInt()
    val inRange = readLine()!!.toInt()

    if (inRange in numRange1..numRange1a && inRange in numRange2..numRange2a) {
        println("true")
    } else {
        println("false")
    }
}
