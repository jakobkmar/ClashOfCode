fun main() {
    val input = readLine()!!.countHoles()
    println(input + Integer.toHexString(input).countHoles())
}

private fun String.countHoles() = sumBy { t -> "ABBDOPQRabdegopq046889".count { it == t } }