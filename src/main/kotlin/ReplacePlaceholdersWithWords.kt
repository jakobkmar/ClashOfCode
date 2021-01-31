fun main() {
    var result = readLine()!!
    val amount = readLine()!!.toInt()
    for (i in 0 until amount)
        result = result.replaceFirst("_", readLine()!!)
    println(result)
}