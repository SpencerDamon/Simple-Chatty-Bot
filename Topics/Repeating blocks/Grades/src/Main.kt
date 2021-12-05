const val GRADE_A = 5
const val GRADE_B = 4
const val GRADE_C = 3

fun main() {
    val iterations = readLine()!!.toInt()
    var a = 0
    var b = 0
    var c = 0
    var d = 0

    repeat(iterations) {
        val stdInput = readLine()!!.toInt()
        if (stdInput == GRADE_A) {
            a++
        } else if (stdInput == GRADE_B) {
            b++
        } else if (stdInput == GRADE_C) {
            c++
        } else {
            d++
        }
    }

    println("$d $c $b $a")
}