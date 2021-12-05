const val SIXTY = 60
fun main() {
    val hours1 = readLine()!!.toLong()
    val minutes1 = readLine()!!.toLong()
    val seconds1 = readLine()!!.toLong()
    
    val hours2 = readLine()!!.toLong()
    val minutes2 = readLine()!!.toLong()
    val seconds2 = readLine()!!.toLong()
   
    val hoursToSeconds1 = hours1 * SIXTY * SIXTY
    val minutesToSeconds1 = minutes1 * SIXTY
    val timeInSeconds1 = hoursToSeconds1 + minutesToSeconds1 + seconds1

    val hoursToSeconds2 = hours2 * SIXTY * SIXTY
    val minutesToSeconds2 = minutes2 * SIXTY
    val timeInSeconds2 = hoursToSeconds2 + minutesToSeconds2 + seconds2
    
    println(timeInSeconds2 - timeInSeconds1)    
}
