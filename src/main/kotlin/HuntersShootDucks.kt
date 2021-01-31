fun main() {
    readLine()
    val d = readLine()!!.toLong()
    val sDs = mutableSetOf<Int>()
    while (true) {
        sDs.add(readLine()?.toInt() ?: break)
    }
    println(d - sDs.size)
}