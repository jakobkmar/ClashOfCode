fun main() {
    val oddAmount = readLine()!!.toInt()
    val foundNumbers = HashSet<Int>()
    var currentNumber = 1
    while (foundNumbers.size < oddAmount) {
        if (currentNumber % 2 != 0) foundNumbers += currentNumber
        currentNumber++
    }
    println(foundNumbers.sum())
}
