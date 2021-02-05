fun main() {
    val ints = readLine()!!.map { it.toString().toInt() }
    println(ints.minOrNull())
    println(ints.maxOrNull())
}