fun main() {
    val i = readLine()!!.toInt()
    for (ja in 0 until i) {
        println(readLine()!!.split(", ").getOrNull(1) ?: "N/A")
    }
}