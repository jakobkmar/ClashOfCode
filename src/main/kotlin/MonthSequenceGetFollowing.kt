private val year = "JFMAMJJASOND".repeat(100)
fun main() {
    val months = readLine()!!
    println(year.split(months)[2].firstOrNull() ?: 'F')
}