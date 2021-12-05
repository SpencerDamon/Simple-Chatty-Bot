fun main() {
    var num: Int
    var sum = 0

    do {
        num = readLine()!!.toInt()
        sum += num
        
    } while (num > 0)

    println(sum)
}
