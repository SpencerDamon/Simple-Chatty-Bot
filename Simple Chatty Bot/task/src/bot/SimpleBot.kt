package bot

import java.util.Scanner


val scanner = Scanner(System.`in`) // Do not change this line

fun main() {
    greet("JetBrains Aid", "2021") // change it as you need
    remindName()
    guessAge()
    count()
    test()
}

fun greet(assistantName: String, birthYear: String) {
    println("Hello! My name is ${assistantName}.")
    println("I was created in ${birthYear}.")
    println("Please, remind me your name.")
}

fun remindName() {
    val name = scanner.nextLine()
    println("What a great name you have, ${name}!")
}

fun guessAge() {
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")
    val rem3 = scanner.nextInt()
    val rem5 = scanner.nextInt()
    val rem7 = scanner.nextInt()
    val age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105
    println("Your age is ${age}; that's a good time to start programming!")
}

fun count() {
    println("Now I will prove to you that I can count to any number you want.")
    val num = scanner.nextInt()
    for (i in 0..num) {
        print(i)
        println("!")
    }
}

fun test() {
    println("Let's test your programming knowledge.")
    println("Let's test your programming knowledge.")
    println("What is not a main driving point for Kotlin development?")
    println(
        """1. Kotlin is Declarative
    2. Kotlin is Robust
    3. Kotlin is Safe
    4. Kotlin is Readable
    5. Kotlin complies faster"""
    )
    var answer = scanner.nextInt()

    while (answer != 5) {
        println("Please, try again.")
        answer = scanner.nextInt()

    }
    end()
}

fun end() {
    println("Congratulations, have a nice day!") // Do not change this text
}
