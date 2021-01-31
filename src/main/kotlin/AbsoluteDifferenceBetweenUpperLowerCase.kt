import kotlin.math.absoluteValue

fun main() {
    val i = readLine()!!
    println((i.count { it.isLowerCase() } - i.count { it.isUpperCase() }).absoluteValue)
}