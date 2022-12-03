import java.util.*

data class User(
        val user_id: UUID,
        val name: String,
        val surname: String,
        var mail: String,
        var password: String,
        var tel_no: String,
        var role: String
);