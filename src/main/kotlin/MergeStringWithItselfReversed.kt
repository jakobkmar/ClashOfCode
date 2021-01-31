fun main() {
    val input = readLine()!!
    val rev = input.reversed()
    println(buildString {
        for (i in input.indices) {
            append(input[i])
            append(rev[i])
        }
    })
}