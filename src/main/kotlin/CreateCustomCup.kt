fun main() {
    val text = readLine()
    val straw = if (readLine() == "1") '|' else '_'
    print(
        """
        ____${straw}____
        \       /
         \  $text  /
          \___/
        """.trimIndent()
    )
}