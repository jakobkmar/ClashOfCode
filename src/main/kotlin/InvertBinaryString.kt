fun main() {
    val a = readLine()!!.map {
        if (it=='0') '1' else '0'
    }
    println(a.joinToString(""))
}