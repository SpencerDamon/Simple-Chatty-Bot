import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    val balance = scanner.nextInt()
    var nextDebit = 0
    var debitTtl = 0
    var newBalance = balance

    while (scanner.hasNextInt()) {
        nextDebit = scanner.nextInt()

        if (nextDebit <= newBalance) {
            newBalance -= nextDebit
            debitTtl += nextDebit
        } else {
            debitTtl += nextDebit
        }
    }

    if (debitTtl > balance) {
        println("Error, insufficient funds for the purchase. Your balance is $newBalance, but you need $nextDebit.")

    } else {
        println("Thank you for choosing us to manage your account! Your balance is $newBalance.")
    }
}
