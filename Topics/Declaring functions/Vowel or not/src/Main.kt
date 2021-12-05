fun isVowel(letter: Char): Boolean {
    val capLetter = letter.uppercaseChar()

    return capLetter == 'A' || capLetter == 'E' || capLetter == 'I' || capLetter == 'O' || capLetter == 'U'
}

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}