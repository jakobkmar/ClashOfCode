fun main() {
    repeat(readLine()!!.toInt()) {
        val i = readLine()!!.split(' ')
        println(i[0].toInt() * (i[1].toInt() * 60) / 100)
    }
}
