// Properties/Task3.kt
package propertiesExercise3

class Robot {
  val fieldSize = 100
  var x = 0
  var y = 0

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
  val robot = Robot()
  println(robot.getLocation())
  robot.up(1)
  println(robot.getLocation())
  robot.left(10)
  println(robot.getLocation())
}
/* Output:
(0, 0)
(0, 99)
(90, 99)
*/