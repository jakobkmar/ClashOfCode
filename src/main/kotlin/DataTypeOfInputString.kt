fun main() {
    val string = readLine()!!
    print(string.toIntOrNull()?.let { "integer" }
        ?: string.toFloatOrNull()?.let { "float" }
        ?: "string")
}