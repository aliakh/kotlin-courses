// IfExpressions/Task4.kt
package ifExpressionsExercise4

fun oneOrTheOther(expression: Boolean) =
  if (expression)
    "True!"
  else
    "False"

fun main() {
  val x = 1
  println(oneOrTheOther(x == 1))  // True!
}