fun main() {
    val limit = readLine()!!.toInt()
    var index = 0
    var num = 0
    
    while (index < limit) {
        num++

        repeat(num) {
            if (index < limit) {
                index++
                println(num)
            }
        }
    }
}
