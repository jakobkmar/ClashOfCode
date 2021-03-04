fun main() {
    val a = readLine()!!
    val b = readLine()!!.toInt()
    fun Int.doesSatisfy() = toString().endsWith(a) && "${a}${toString().removeSuffix(a)}".toInt() == b * this
    var i = 0
    while (!i.doesSatisfy())
        i++
    println(i)
}
