fun main() {
    var m = readLine()!!.toInt()
    val n = m.toString()
    while (true) {
        m++
        if (m.toString().none { n.contains(it) }) {
            println(m)
            break
        }
    }
}
