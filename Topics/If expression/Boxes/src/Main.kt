fun main() {
    var (x1, y1, z1) = readLine()!!
        .split(" ").map { it.toInt() }
        .sorted()
    var (x2, y2, z2) = readLine()!!
        .split(" ").map { it.toInt() }
        .sorted()
    /* Manual sorting below:
    var temp1: Int
    var temp2: Int

    if (z1 < y1) {
        temp1 = y1
        y1 = z1
        z1 = temp1
    }

    if (z1 < x1) {
        temp1 = x1
        x1 = z1
        z1 = temp1
    }

    if (y1 < x1) {
        temp1 = x1
        x1 = y1
        y1 = temp1
    }

    if (z2 < y2) {
        temp2 = y2
        y2 = z2
        z2 = temp2
    }

    if (z2 < x2) {
        temp2 = x2
        x2 = z2
        z2 = temp2
    }

    if (y2 < x2) {
        temp2 = x2
        x2 = y2
        y2 = temp2
    } */

    if (x1 == x2 && y1 == y2 && z1 == z2) {
        println("Box 1 = Box 2")
    } else if (x1 >= x2 && y1 >= y2 && z1 >= z2) {
        println("Box 1 > Box 2")
    } else if (x1 <= x2 && y1 <= y2 && z1 <= z2) {
        println("Box 1 < Box 2")
    } else {
        println("Incomparable")
    }
}
