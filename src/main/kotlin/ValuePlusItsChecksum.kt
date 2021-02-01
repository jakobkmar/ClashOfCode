fun main() {
    val input = readLine()!!
    println(input.toInt() + input.map { it.toString().toInt() }.sum())
}