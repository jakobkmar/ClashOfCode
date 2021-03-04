fun main() {
    val line2 = readLine()!!.reversed()
    var i = 0
    readLine()!!.forEachIndexed { index, c ->
        if (line2[index] != c)
            i++
    }
    println(i)
}
