import org.springframework.stereotype.Repository
import java.util.UUID
import org.springframework.data.repository.kotlin.CoroutineCrudRepository

@Repository
interface UserRepository : CoroutineCrudRepository<User, UUID> {

}