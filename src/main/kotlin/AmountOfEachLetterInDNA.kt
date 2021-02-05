fun main() {
    val input = readLine()!!
    val amounts = mutableListOf<Int>()
    "ACGT".forEach { c ->
        amounts += input.count { it == c }
    }
    println(amounts.joinToString(" "))
}