import java.time.Duration.between
import java.time.LocalTime.MIN
import java.time.LocalTime.parse

fun main() = println(between(MIN, parse(readLine()!!)).toMinutes())