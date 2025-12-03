// PropertyDelegation/PropDelegationSoln3.kt
package propertyDelegationExercise2
import atomictest.eq
import kotlin.reflect.KProperty

class Delegator {
  private var list = List(8) { "$it" }

  var strings: List<String> by list

  operator fun List<String>.getValue(
    r: Delegator,
    property: KProperty<*>
  ): List<String> = r.list
  operator fun List<String>.setValue(
    w: Delegator,
    property: KProperty<*>,
    list: List<String>
  ) {
    w.list = list
  }
}

fun main() {
  val delegator = Delegator()
  delegator.strings eq "[0, 1, 2, 3, 4, 5, 6, 7]"
  delegator.strings = listOf("99", "17")
  delegator.strings eq "[99, 17]"
}