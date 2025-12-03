// Constructors/Task2.kt
package constructorsExercise2

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
}

fun main() {
  val robot = Robot(10, 1, 1)
  println(robot.getLocation())
  robot.up(2)
  println(robot.getLocation())
  robot.left(10)
  println(robot.getLocation())
}
/* Expected output:
(1, 1)
(1, 9)
(1, 9)
*/