fun main() {
    val input = readLine()!!
    println("(${input.take(3)}) ${input.substring(3 until 6)}-${input.takeLast(4)}")
}