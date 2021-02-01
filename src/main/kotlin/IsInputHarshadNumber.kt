fun main() {
    val line = readLine()!!
    println(line.toDouble() / line.sumBy { it.toString().toInt() } % 1 == 0.0)
}