fun main() {
    val inputString: String = readLine()!!
    val num: Int = readLine()!!.toInt()
    val elementToIndex = num - 1
    println("Symbol # $num of the string \"$inputString\" is '${inputString[elementToIndex]}'")
}