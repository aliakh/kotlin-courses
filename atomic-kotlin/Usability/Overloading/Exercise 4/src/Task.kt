// Overloading/Task4.kt
package overloadingExercise4
import atomictest.eq

fun f(n: Int = 0, addend: Int) =
  n + addend

fun main() {
  f(addend = 373) eq 373
}