fun main() {
    val bob = readInts()
    val erica = readInts()
    println("${(bob[0] + erica[0]) / 2} ${(bob[1] + erica[1]) / 2}")
}

private fun readInts() = readLine()!!.split(' ').map { it.toInt() }