val jo = mapOf(
    'A' to 'T',
    'C' to 'G',
    'G' to 'C',
    'T' to 'A'
)
fun main() {
    println(readLine()!!.map { jo[it] }.joinToString(""))
}