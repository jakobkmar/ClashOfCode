const val a = " /\\ "
const val b = "<  >"
const val c = " \\/ "
fun main() {
    val i = readLine()!!.toInt()
    for (n in 0 until i) {
        println(a.repeat(i).trimEnd())
        println(b.repeat(i).trimEnd())
        println(c.repeat(i).trimEnd())
    }
}
