const val ONE = 1
const val ONETHOUSAND = 1_000

fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    val d = readLine()!!.toInt()
    
    for (x in ONE..ONETHOUSAND) {
        if (a * (x * x * x) + b * (x * x) + c * x + d == 0) println(x)
    }
}
