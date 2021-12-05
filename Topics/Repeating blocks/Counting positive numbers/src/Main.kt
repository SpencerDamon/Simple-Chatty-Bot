fun main() {
    val indexSize = readLine()!!.toInt()
    var numOfPosInt = 0

    repeat(indexSize) {
        if (readLine()!!.toInt() > 0) numOfPosInt++
    }

    println(numOfPosInt)
}