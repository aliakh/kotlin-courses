// Visibility/Task3.kt
package constrainingVisibilityExercise3

class Robot(
  private val fieldSize: Int,
  private var x: Int,
  private var y: Int
) {
  private fun round(coordinate: Int): Int {
    val result = coordinate % fieldSize
    return if (result < 0) {
      result + fieldSize
    } else {
      result
    }
  }

  private fun verify(steps: Int): Boolean {
    if (steps <= 0) {
      println("steps argument must be positive, is $steps")
      return true
    } else {
      return false
    }
  }

  fun right(steps: Int) {
    if (verify(steps)) return
    x = round(x + steps)
  }

  fun left(steps: Int) {
    if (verify(steps)) return
    x = round(x - steps)
  }

  fun down(steps: Int) {
    if (verify(steps)) return
    y = round(y + steps)
  }

  fun up(steps: Int) {
    if (verify(steps)) return
    y = round(y - steps)
  }

  fun getLocation(): String = "($x, $y)"

  override fun toString() = "Robot(x=$x,y = $y)"
}

fun main() {
  val robot = Robot(10, 1, 1)
  robot.right(-1)
}
/* Output:
steps argument must be positive, is -1
*/