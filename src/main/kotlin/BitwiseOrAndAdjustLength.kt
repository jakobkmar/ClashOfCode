fun main() {
    val input = readLine()!!
    println(
        Integer.toBinaryString(
            input.toInt(2) or readLine()!!.toInt(2)
        ).padStart(input.length, '0')
    )
}
