import kotlin.math.pow
import kotlin.math.round
import kotlin.math.sqrt

fun main() {
    val n = readLine()!!.split(' ')[1].toInt() - 1
    lateinit var a: Pair<Int, Int>
    lateinit var b: Pair<Int, Int>
    for (i in 0..n) {
        val line = readLine()!!
        line.indexOf('A').let { if (it != -1) a = Pair(it + 1, i + 1) }
        line.indexOf('B').let { if (it != -1) b = Pair(it + 1, i + 1) }
    }
    println(round(sqrt((a.first - b.first).toDouble().pow(2) + (a.second - b.second).toDouble().pow(2))).toInt())
}