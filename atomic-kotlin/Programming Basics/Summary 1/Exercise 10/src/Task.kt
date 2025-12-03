// Summary1/Task10.kt
package summaryIExercise10

fun showSnake(rows: Int, columns: Int) {
  val width = (rows * columns).toString().length + 1
  for (x in 0 until rows) {
    for (y in 0 until columns) {
      val number =
        if (x % 2 == 0)
          x * columns + y
        else
          x * columns + columns - 1 - y
      print("%${width}d".format(number))
    }
    println()
  }
}

fun main() {
  showSnake(2, 3)
  println()
  showSnake(4, 5)
}
/* Output:
 0 1 2
 5 4 3

  0  1  2  3  4
  9  8  7  6  5
 10 11 12 13 14
 19 18 17 16 15
*/