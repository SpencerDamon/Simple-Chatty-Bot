fun main() {
    val days = readLine()!!.toInt()
    val foodCost = readLine()!!.toInt() * days
    val airFare = readLine()!!.toInt() * 2
    val hotelCost = readLine()!!.toInt() * (days - 1)
    println(foodCost + airFare + hotelCost)
}
