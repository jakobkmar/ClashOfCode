fun main() {
    val first = readLine()!![0]
    val second = readLine()!![0]
    println(readLine()!!.map { if (it == first) second else first }.joinToString(""))
}
