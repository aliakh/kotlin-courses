// DataTypes/Task2.kt
package dataTypesExercise2

fun main() {
  val int: Int = 10
  val double: Double = 1.1
  val boolean: Boolean = false
  val string: String = "abc"
  val character: Char = 'a'

  // Can be combined:
  val ii: Int = int + int
  val id: Double = int + double

  val di: Double = double + int
  val dd: Double = double + double

  val si: String = string + int
  val sd: String = string + double
  val sb: String = string + boolean
  val ss: String = string + string
  val sc: String = string + character

  val ci: Char = character + int
  val cs: String = character + string

  println("The type that can be combined " +
    "with every other type using '+':")
  println("String")

  // Can't be combined:
//    val ib = int + boolean
//    val `is` = int + string
//    val ic = int + character
//
//    val db = double + boolean
//    val ds = double + string
//    val dc = double + character
//
//    val bi = boolean + int
//    val bd = boolean + double
//    val bb = boolean + boolean
//    val bs = boolean + string
//    val bc = boolean + character
//
//    val cd = character + double
//    val cb = character + boolean
//    val cc = character + character
}