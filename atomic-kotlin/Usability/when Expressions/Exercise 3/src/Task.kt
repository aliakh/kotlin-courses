// WhenExpressions/Task3.kt
package whenExpressionsExercise3
import atomictest.eq

fun balanced(s: String): Boolean {
  var balance = 0
  for (c in s) {
    when (c) {
      '(' -> balance++
      ')' -> balance--
      ' ' -> {}
      else -> throw IllegalArgumentException("The string must consist only of parentheses and whitespaces")
    }
    if (balance < 0)
      return false
  }
  return balance == 0
}

fun main() {
  balanced("(()) ()") eq true
  balanced(")(") eq false
}