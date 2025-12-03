// InKeyword/Task1.kt
package theInKeywordExercise1

fun getAlphabet(): String {
  var result = ""
  for (c in 'a'..'z') {
    result += c
  }
  return result
}

fun main() {
  println(getAlphabet())  // abcdefghijklmnopqrstuvwxyz
}