fun main() {
    val x = readLine()!!.toInt()
    val n = readLine()!!.toInt()
    for (i in 0 until n) {
        val category = readLine()!!.split(' ')
        val range = category[0].toInt() .. category[1].toInt()
        if (x in range)
            println(category[2])
    }
}