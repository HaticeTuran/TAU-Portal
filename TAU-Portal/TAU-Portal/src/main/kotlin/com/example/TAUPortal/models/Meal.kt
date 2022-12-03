import java.time.LocalDateTime
import java.util.*

data class Meal(
        val meal_id: UUID,
        val date: LocalDateTime,
        val cal: Int
)