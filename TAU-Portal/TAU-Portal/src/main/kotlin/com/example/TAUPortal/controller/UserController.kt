import kotlinx.coroutines.flow.Flow
import User
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@Service
@RestController
@RequestMapping("/users")
class UserController(val service: UserService) {

    // Get Methods
    @GetMapping("/users")
    suspend fun findUsers(): Flow<User> {
        return service.findUsers()
    }

    // Get Methods
    @PostMapping()
    suspend fun saveUser(@RequestBody() user: User) {
        return service.saveUser(user)
    }
}