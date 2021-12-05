const val PST = 8
const val SECINHOUR = 3600
const val SIXTY = 60
const val HOURSINDAY = 24
const val ONETHOUSAND = 1000
fun main() {
    val totalSeconds = System.currentTimeMillis() / ONETHOUSAND
    totalSeconds + PST * SECINHOUR
    val hours = totalSeconds / SIXTY / SIXTY % HOURSINDAY
    val minutes = totalSeconds / SIXTY % SIXTY
    val seconds = totalSeconds % SIXTY
    print(hours)
    print(":")
    print(minutes)
    print(":")
    print(seconds)
}
