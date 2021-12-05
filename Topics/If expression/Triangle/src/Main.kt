fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    println(if (a + b <= c || b + c <= a || a + c <= b) "NO" else "YES")
}
