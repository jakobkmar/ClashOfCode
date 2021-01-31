fun main() {
    val n = readLine()!!.toLong()
    val m = readLine()!!.toLong()
    println("ROWS:")
    val ok = mutableListOf<Long>()
    for (i in 0 until m) ok.add(0L)
    for (i in 0 until n) {
        val row = readLine()!!
        println(row.count { it == '*' })
        row.forEachIndexed { index, c ->
            if (c == '*') ok[index] = ok[index].inc()
        }
    }
    println("COLUMNS:")
    ok.forEach(::println)
}