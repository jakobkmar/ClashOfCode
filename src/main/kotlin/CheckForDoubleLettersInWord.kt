fun main() {
    val w = readLine()!!
    var a = false
    w.reduce { acc, c -> if (acc == c) a = true; c.toLowerCase() }
    println(a)
}