fun main() {
    val s = readLine()!!
    print(s.sumBy {
        val c = it.toInt()
        if (c%2!=0)
            c
        else 0
    })
}