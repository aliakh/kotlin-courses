// Functions/MultiplyByTwo.kt

fun multiplyByTwo(x: Int): Int {  // [1]
  println("Inside multiplyByTwo") // [2]
  return x * 2
}

fun main() {
  val result = multiplyByTwo(5)        // [3]
  println(result)
}
/* Output:
Inside multiplyByTwo
10
*/