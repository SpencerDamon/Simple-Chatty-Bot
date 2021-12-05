const val ONE = 1
fun main() {
    var spam = 0
    var eggs: Int
    var countAhead = ONE
    var burnedSpam = ONE
    val limit = readLine()!!.toInt()

    while (countAhead <= limit) {
        spam++
        burnedSpam++
        eggs = spam * spam
        countAhead = burnedSpam * burnedSpam
        println(eggs)
    }
}