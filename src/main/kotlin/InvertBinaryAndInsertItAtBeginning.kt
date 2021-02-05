fun main() {
    val binary = Integer.toBinaryString(readLine()!!.toInt())
    for (n in binary.indices)
        println(
            (
                binary.reversed().substring(binary.lastIndex - n, binary.length) +
                binary.substring(n + 1)
            ).toInt(2)
        )
}