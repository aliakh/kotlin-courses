// MemberReferences/TopLevelFunctionRef.kt
package memberreferences2
import atomictest.eq

fun ignore(message: Message) =
  !message.isImportant() &&
    message.sender in setOf("Boss", "Mom")

fun main() {
  val text = "Let's discuss goals for the next year"
  val messages = listOf(
    Message("Boss", text, false, listOf()),
    Message("Boss", text, false, listOf(Attachment("image", "cute cats"))))
  messages.filter(::ignore).size eq 1
  messages.filterNot(::ignore).size eq 1
}