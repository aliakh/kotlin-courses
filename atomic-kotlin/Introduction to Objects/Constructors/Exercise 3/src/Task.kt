// Constructors/Task3.kt
package constructorsExercise3

class Robot(val fieldSize: Int, var x: Int, var y: Int) {
  fun round(coordinate: Int): Int {
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
  println(robot)
}
/* Output:
Robot(x=1, y=1)
*/