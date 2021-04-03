import kotlin.math.pow

fun main() {
    val i = readLine()!!.toInt()
    println(readLine()!!.split(' ').map { it.toDouble().pow(2) }.sum().toInt())
}
