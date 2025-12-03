// InKeyword/Task4.kt
package theInKeywordExercise4

// isValidCharacter

fun isLetter(c: Char): Boolean =
  c in 'a'..'z'  || c in 'A'..'Z'

fun isUnderscore(c: Char): Boolean =
  c == '_'

fun isDigit(c: Char): Boolean =
  c in '0'..'9'

fun isValidIdentifier(s: String): Boolean {
  if (s.isEmpty())
    return false
  if (!isLetter(s[0]) && !isUnderscore(s[0]))
    return false
  for (c in s.takeLast(s.length - 1)) {
    if (!isLetter(c) && !isDigit(c) && !isUnderscore(c))
      return false
  }
  return true
}

fun main() {
  println(isValidIdentifier("name"))  // true
  println(isValidIdentifier("0name"))  // false
}