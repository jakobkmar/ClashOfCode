fun main() {
    val lines = readLine()!!.toInt()
    val outers = ArrayList<Int>()
    var inners = 0
    for (n in 0 until lines) {
        val currentInts = readLine()!!.trim().split(' ').map { it.toInt() }
        outers += if (n == 0 || n == lines - 1) currentInts
        else listOf(currentInts[0], currentInts.last())
        if (n == lines / 2) inners = currentInts[currentInts.size / 2]
    }
    print(inners == outers.maxOrNull())
}