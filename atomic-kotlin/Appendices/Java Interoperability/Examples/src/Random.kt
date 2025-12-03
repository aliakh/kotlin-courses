// interoperability/Random.kt
import atomictest.eq
import java.util.Random

fun main() {
  val random = Random(47)
  random.nextInt(100) eq 58
}