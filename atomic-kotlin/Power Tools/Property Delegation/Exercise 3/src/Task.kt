// PropertyDelegation/PropDelegationSoln4.kt
package propertyDelegationExercise3
import atomictest.eq
import kotlin.reflect.KProperty

class Holder<E> {
  private var list = listOf<E>()
  operator fun getValue(
    delegator: Holders,
    property: KProperty<*>
  ): List<E> = list
  operator fun setValue(
    delegator: Holders,
    property: KProperty<*>,
    value: List<E>
  ) {
    list = value
  }
}

class Holders {
  var strings by Holder<String>()
  var ints by Holder<Int>()
  var bools by Holder<Boolean>()
}

fun main() {
  val holders = Holders()
  holders.strings = listOf("99", "17")
  holders.strings eq "[99, 17]"
  holders.ints = listOf(12, 23, 34, 45)
  holders.ints eq "[12, 23, 34, 45]"
  holders.bools = listOf(true, true, false, true)
  holders.bools eq "[true, true, false, true]"
}