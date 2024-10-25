data class Event(
    val title: String,
    val descriptor: String? = null,
    val dayPart: String,
    val duration: String,
)

fun main() {
    Event("Study Kotlin", "Commit to studying Kotlin at least 15 minutes per day.", "Evening", "15")
}