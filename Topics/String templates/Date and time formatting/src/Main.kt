fun main() {
    val (hour, min, sec) = readLine()!!.split(" ")
    val (month, day, year) = readLine()!!.split(" ")
    println("$hour:$min:$sec $month/$day/$year")
}