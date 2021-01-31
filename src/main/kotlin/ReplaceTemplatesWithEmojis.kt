private val emojis = mapOf(
    ":slight_smile:" to ":)",
    ":disappointed:" to ":(",
    ":loud_laugh:" to "XD",
    ":open_mouth:" to ":o",
    ":stuck_out_tongue:" to ":p"
)

fun main() = println(readLine()!!.replaceAll(emojis))

private fun String.replaceAll(map: Map<String, String>): String {
    var result = this
    map.forEach { (t, u) -> result = result.replace(t, u) }
    return result
}