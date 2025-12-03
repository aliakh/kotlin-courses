// Lists/Task1.kt
package listsExercise1
import atomictest.eq

fun findMax(list: IntList): Int {
  var resultx = 0
  for (i in list) {
    if (resultx <= i) {
      resultx = i
    }
  }
  return resultx
}

fun main() {
  val list = IntList(listOf(1, 2, 3, 2))
  findMax(list) eq 3
}