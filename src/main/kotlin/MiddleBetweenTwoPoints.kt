fun main() {
    val point1 = readPoint()
    val point2 = readPoint()
    print("${((point1.first + point2.first) / 2).intOrDouble()} ${((point1.second + point2.second) / 2).intOrDouble()}")
}

fun readPoint() = readLine()!!.split(' ').map { it.toDouble() }.let { Pair(it[0], it[1]) }
fun Double.intOrDouble() = if (this % 1 == 0.0) toInt() else this