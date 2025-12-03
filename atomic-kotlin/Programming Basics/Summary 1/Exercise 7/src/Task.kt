// Summary1/Task7.kt
package summaryIExercise7

fun countDigits(number: Int, digit: Int): Int {
  var n = number
  var i = 0
  while (n > 0) {
    if (n % 10 == digit) {
      i++
    }
    n /= 10
  }
  return i
}

fun main() {
  println(countDigits(764241, 4)) // 2
}