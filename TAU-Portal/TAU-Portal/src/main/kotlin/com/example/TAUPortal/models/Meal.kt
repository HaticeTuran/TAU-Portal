import java.time.LocalDateTime;
import java.util.UUID;

data class Meal(
        val meal_id: UUID,
        val date: LocalDateTime,
        val cal: Int
);