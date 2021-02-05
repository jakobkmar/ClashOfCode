fun main() {
    val ints = readLine()!!.split(' ').map { it.toLong() }
    val intAmount = ints.map { it to ints.count { i -> i == it } }
    println(intAmount.minByOrNull { it.second }?.first)
}