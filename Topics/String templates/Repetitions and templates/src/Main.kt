fun main() {
    val string = readLine()!!
    val len = string.length
    println("$len repetitions of the word $string: ${string.repeat(len)}")
}