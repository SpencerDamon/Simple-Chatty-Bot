fun main() {
    
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    println(
        if (a > c) {
            if (b >= a) b else a
        } else {
            if (c >= b) c else b
        }
    )
}
