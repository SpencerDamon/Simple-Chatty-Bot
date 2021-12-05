const val REP = 4
fun main() {
    repeat(REP) {
        var ch = readLine()!!.first()
        println(--ch)
    }
}