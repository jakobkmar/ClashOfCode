fun main() {
    val n = readLine()!!.toInt()
    var cheese = 0
    repeat(n) {
        cheese += readLine()!!.count { it == '*' }
    }
    println("${((cheese.toDouble() / (n*n)) * 100).toInt()}%")
}
