fun main() {
    println(readLine()!!.map { it.toString().toInt() }.filter { it % 2 == 0 }.sum())
}
