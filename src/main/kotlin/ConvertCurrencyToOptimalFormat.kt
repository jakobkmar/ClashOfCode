fun main() {
    var sum = 0
    sum += readLine()!!.toInt() * 100 * 100
    sum += readLine()!!.toInt() * 100
    sum += readLine()!!.toInt()

    val g = sum / (100*100)
    val s = sum / 100 - g*100
    val b = sum - ((g*100*100)+(s*100))

    println("${g}G ${s}S ${b}B")
}