fun main() {
    val strings = ArrayList<String>()
    for (i in 0 until readLine()!!.toInt())
        strings += readLine()!!
    val averageAscii = strings.map {
        it.replace(" ", "")
            .map { ascii -> ascii.toInt() }.average()
    }
    print(strings[averageAscii.indexOf(averageAscii.minOrNull())][0])
    print(strings[averageAscii.indexOf(averageAscii.maxOrNull())].last())
}