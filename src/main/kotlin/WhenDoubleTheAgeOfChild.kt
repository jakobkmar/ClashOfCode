fun main() {
    val parentAge = readLine()!!.toInt()
    val n = readLine()!!.toInt()
    for (i in 0 until n)
        println(2*parentAge - 2*readLine()!!.toInt())
}