// InKeyword/Task3.kt
package theInKeywordExercise3

fun isLowerCase(c: Char): Boolean =
  c in 'a'..'z'

fun main() {
  println(isLowerCase('A'))  // false
  println(isLowerCase('b'))  // true
}