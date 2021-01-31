import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    readLine()!!.split(' ').apply {
        println(sqrt(last().toDouble().pow(2) + first().toDouble().pow(2)).toInt())
    }
}