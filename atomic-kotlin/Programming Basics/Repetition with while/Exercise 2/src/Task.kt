// RepetitionWithWhile/Task2.kt
package repetitionWithWhileExercise2

fun sum(n: Int): Int {
  var result = 0
  var i = 0
  while (i <= n) {
    result += i
    i++
  }
  return result
}

fun main() {
  println(sum(10))  // 55
}