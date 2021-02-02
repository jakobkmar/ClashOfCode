val abc = ('A' .. 'Z')
fun main() {
    var input = readLine()!!.map {
        var pos = (abc.indexOf(it.toUpperCase()) + 1)
        if (it.isUpperCase())
            pos *= 2
        pos
    }.sum().toString()
    while (input.length < 6)
        input += "0"
    if (input.length > 6)
        input.takeLast(input.lastIndex - 6)
    println(input)
}