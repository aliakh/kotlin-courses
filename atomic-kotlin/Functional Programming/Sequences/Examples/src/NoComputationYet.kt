// Sequences/NoComputationYet.kt
import atomictest.eq
import sequences.*

fun main() {
  val result = listOf(1, 2, 3, 4)
    .asSequence()
    .filter(Int::isEven)
    .map(Int::square)
  result.toString().substringBefore("@") eq
    "kotlin.sequences.TransformingSequence"
}