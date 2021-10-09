fun main() {
    println(readLine()!!
        .map { if (it.isUpperCase()) it.toLowerCase() else it.toUpperCase() }
        .joinToString("")
    )
}
