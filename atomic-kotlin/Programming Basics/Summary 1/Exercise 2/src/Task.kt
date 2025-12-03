// Summary1/Task2.kt
package summaryIExercise2

fun other(s: String): String {
  var result = ""
  var i = 0
  for (c in s) {
    if (i % 2 == 0) {
      result += c
    }
    i++
  }
  return result
}

fun main() {
  println(other("cement"))
}
/* Output:
cmn
*/