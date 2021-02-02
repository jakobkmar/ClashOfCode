fun main() {
    val ints = readLine()!!.split(' ').map { it.toInt() }
    if (ints[0]*ints[2]>=ints[1]) println("yes") else println("no")
}