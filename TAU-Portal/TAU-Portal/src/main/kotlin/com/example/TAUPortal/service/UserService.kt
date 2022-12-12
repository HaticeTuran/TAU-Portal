package com.example.TAUPortal.service

import com.example.TAUPortal.models.User
import com.example.TAUPortal.repository.UserRepository
import kotlinx.coroutines.flow.Flow
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserService(val repository: UserRepository) {

    suspend fun findUsers(): Flow<User> {
        return repository.findAll()
    }

    suspend fun findUserById(id: UUID): User? {
        return repository.findById(id)
    }

    suspend fun saveUser(user: User) {
        repository.save(user)
    }

    suspend fun deleteUserById(id: UUID) {
        repository.deleteById(id)
    }
}