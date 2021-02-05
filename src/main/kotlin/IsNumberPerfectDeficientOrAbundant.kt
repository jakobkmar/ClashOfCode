fun main() {
    val int = readLine()!!.toInt()
    val s = (1 until int).filter { int % it == 0 }.sum()
    print(
        when {
            s == int -> "perfect"
            s < int -> "deficient"
            else -> "abundant"
        }
    )
}