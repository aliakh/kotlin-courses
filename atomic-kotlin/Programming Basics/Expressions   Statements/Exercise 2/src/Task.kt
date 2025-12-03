// ExpressionsStatements/Task2.kt
package expressionsAndStatementsExercise2

fun f(a: Int, b: Int) = a + b

fun g(a: String, b: String) = a + b

fun h() = println("h()")

fun main() {
  val result1: Int = f(1, 2)
  println("Int")

  val result2: String = g("a", "bc")
  println("String")

  val result3: Unit = h()
  println("Unit")
}