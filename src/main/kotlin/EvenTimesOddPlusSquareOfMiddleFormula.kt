fun main() {
    readLine()
    val ns = readLine()!!.split(' ').map { it.toLong() }
    val one = ns.filter { it % 2L == 0L }.sum()
    val two = ns.filter { it % 2L != 0L }.sum()
    val third = ns[ns.lastIndex/2]
    println("$one x $two + $third^2 = ${one * two + (third*third)}")
}