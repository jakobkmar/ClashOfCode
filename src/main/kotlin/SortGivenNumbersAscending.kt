fun main() {
    val i = readLine()!!.toInt()
    println(readLine()!!.split(' ').sortedBy { it.toInt() }.joinToString(" "))
}
