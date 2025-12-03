// Visibility/Task2.kt
package constrainingVisibilityExercise2

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

  fun right(steps: Int) {
    x = round(x + steps)
  }

  fun left(steps: Int) {
    x = round(x - steps)
  }

  fun down(steps: Int) {
    y = round(y + steps)
  }

  fun up(steps: Int) {
    y = round(y - steps)
  }

  fun getLocation(): String = "($x, $y)"

  override fun toString() = "Robot(x=$x, y=$y)"
}

fun main() {
  val robot = Robot(10, 1, 1)
  // Should be "can't access x" error:
//  println(robot.x)
}