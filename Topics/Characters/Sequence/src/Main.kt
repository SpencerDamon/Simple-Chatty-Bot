fun main() {
    var ch1 = readLine()!!.first()
    var ch2 = readLine()!!.first()
    val ch3 = readLine()!!.first()
    val inUniOrder = ++ch1 == ch2 && ++ch2 == ch3
    println(inUniOrder)
}