import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var counter1 = 1
    var counter2 = 1
    var greatestInt = scanner.nextInt()

    while (scanner.hasNextInt()) {
        val num = scanner.nextInt()

        counter1++

        if (num > greatestInt) {
            counter2 = counter1
            greatestInt = num
        }
    }
    println("$greatestInt $counter2")
}
