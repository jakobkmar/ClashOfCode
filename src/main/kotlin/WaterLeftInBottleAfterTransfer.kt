fun main() {
    val l1 = readLine()!!.trim().toInt()
    val l2 = readLine()!!.trim().toInt()
    val l3 = readLine()!!.trim().toInt()
    val added = l1 - l2
    var left = l3 - added
    if (left < 0) left = 0
    println(left * 15)
}