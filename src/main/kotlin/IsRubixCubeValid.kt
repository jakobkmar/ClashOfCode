private const val possibleColors = "ULFRBD"

fun main() {
    var colors = ""
    for (i in 0 until 11) {
        colors += readLine()!!.replace(" ", "")
    }
    var solvable = true
    for (char in possibleColors) {
        if (colors.count { it == char } != 9)
            solvable = false
    }
    if (solvable) println("SOLVABLE") else println("UNSOLVABLE")
}