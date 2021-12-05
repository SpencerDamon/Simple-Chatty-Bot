fun main() {
    val n = readLine()!!.toInt()
    var perfect = 0
    var larger = 0
    var rejections = 0

    repeat(n) {
        val i = readLine()!!.toInt()
        if (i == 0) perfect++
        if (i > 0) larger++
        if (i < 0) rejections++
    }

    println("$perfect $larger $rejections")
}