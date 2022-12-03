import kotlinx.coroutines.flow.Flow
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.*
import java.util.UUID

@Service
@RestController
@RequestMapping("/users")
class UserController(val service: UserService) {

    // Get Methods
    @GetMapping()
    suspend fun findUsers(): Flow<Users> {
        return service.findUsers()
    }
}