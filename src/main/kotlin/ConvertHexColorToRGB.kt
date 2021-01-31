import java.awt.Color

fun main() {
    val color = Color(readLine()!!.removePrefix("#").toInt(16))
    println(color.red)
    println(color.green)
    println(color.blue)
}