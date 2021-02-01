fun main() {
    for (i in 0 until readLine()!!.toInt()) {
        val line = readLine()!!.split(' ').map { it.toInt() }
        println(line[0].binaryInt() + line[1].binaryInt())
    }
}

fun Int.binaryInt() = toString(2).toInt()