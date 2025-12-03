// Summary1/Task8.kt
package summaryIExercise8

fun reverseDecimal(number: Int): Int {
  var n = number
  var result = 0
  while (n > 0) {
    result *= 10
    result += n % 10
    n /= 10
  }
  return result
}

fun main() {
  println(reverseDecimal(1234))  // 4321
}