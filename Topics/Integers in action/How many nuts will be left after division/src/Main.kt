fun main() {
    val squirrels = readLine()!!.toInt()
    val nuts = readLine()!!.toInt()
    val nutsRemaining: Int = nuts % squirrels
    println(nutsRemaining)
}
