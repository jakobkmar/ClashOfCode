fun main() = println((x() + x()).toString(2))
fun x() = readLine()!!.toBigInteger(2)