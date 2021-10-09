fun main() {
    val builder = StringBuilder()
    repeat(readLine()!!.toInt() + 1) {
        builder.append(readLine())
        builder.append("/")
    }
    println("${builder.toString().removeSuffix("/")}.${readLine()}")
}
