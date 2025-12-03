// Properties/Task4.kt
package propertiesExercise4

class Counter {
  var value = 0
  private val step = 10

  fun inc() {
    value += step
  }

  fun dec() {
    value -= step
  }
}