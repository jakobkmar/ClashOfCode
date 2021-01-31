fun main() {
    val a = readLine()!!.toInt()
    for (i in 1 .. a) {
        println(
            buildString {
                for (xd in 1 .. i) append(a)
            }
        )
    }
}