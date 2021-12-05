import java.lang.Character.isUpperCase

fun main() {
    val ch = readLine()!!.first()
    val isCap = ch.isUpperCase()
    val isDigit = ch in '\u0031'..'\u0039'
    println(isCap || isDigit)
}