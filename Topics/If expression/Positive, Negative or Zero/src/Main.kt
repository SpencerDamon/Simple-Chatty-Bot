fun main() {
    val num = readLine()!!.toInt()
    println(
        if (num == 0) {
            "zero"
        } else if (num > 0) {
            "positive"
        } else {
            "negative"
        }
    )
}
