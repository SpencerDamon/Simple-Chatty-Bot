fun main() {
    val h1 = readLine()!!.toInt()
    val h2 = readLine()!!.toInt()
    val h3 = readLine()!!.toInt()
    val inOrder = h1 <= h2 && h2 <= h3 || h1 >= h2 && h2 >= h3
    println(inOrder)
}
