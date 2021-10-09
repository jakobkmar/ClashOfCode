fun main() {
    fun gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
    val ints = readLine()!!.split(' ').map { it.toInt() }
    val gcd = gcd(ints[0], ints[1])
    println(gcd)
    println("${ints[0] / gcd} ${ints[1] / gcd}")
}
