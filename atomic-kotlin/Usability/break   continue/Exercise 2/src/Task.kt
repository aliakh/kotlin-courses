// BreakAndContinue/Task2.kt
package breakAndContinueExercise2

fun analyzeStrings1(listOfLists: List<List<String>>) {
  outer@ for (list in listOfLists) {
    inner@ for (s in list) {
      if (s == "stop") break@inner
      println(s)
    }
  }
}

fun analyzeStrings2(listOfLists: List<List<String>>) {
  outer@ for (list in listOfLists) {
    inner@ for (s in list) {
      if (s == "stop") continue@outer
      println(s)
    }
  }
}

fun main() {
  val strings = listOf(
    listOf("a", "b", "stop", "z", "e"),
    listOf("first", "second", "stop", "ieuwg"))
  println("analyzeStrings1:")
  analyzeStrings1(strings)
  println("analyzeStrings2:")
  analyzeStrings2(strings)
}
/* Output:
analyzeStrings1:
a
b
first
second
analyzeStrings2:
a
b
first
second
*/