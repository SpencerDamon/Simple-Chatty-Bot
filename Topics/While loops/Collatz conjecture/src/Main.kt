const val ONE = 1
const val TWO = 2
const val THREE = 3
fun main() {
    var n = readLine()!!.toInt()

    print(n)

    while (n != ONE) {
        if (n % TWO == 0) {
            n /= TWO
            print(" $n")
        } else {
            n = n * THREE + ONE
            print(" $n")
        }
    }
}