// LocalFunctions/LocalFunctions.kt
import atomictest.eq

fun main() {
  val result = StringBuilder()
  fun log(message: String) = result.appendLine(message)
  log("Starting computation")
  val x = 42  // Imitate computation
  log("Computation result: $x")
  result.toString() eq """
    Starting computation
    Computation result: 42
  """
}