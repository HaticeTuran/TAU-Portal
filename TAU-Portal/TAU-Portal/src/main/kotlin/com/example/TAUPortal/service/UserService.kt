import kotlinx.coroutines.flow.Flow
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.PathVariable
import java.util.UUID

@Service
class UserService(val repository: UserRepository) {

    suspend fun findUsers(): Flow<Users> {
        return repository.findAll()
    }
}