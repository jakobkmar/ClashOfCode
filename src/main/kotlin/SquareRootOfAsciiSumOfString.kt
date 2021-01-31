import kotlin.math.sqrt

fun main() = println(sqrt(readLine()!!.sumBy { it.toInt() }.toDouble()).toInt())