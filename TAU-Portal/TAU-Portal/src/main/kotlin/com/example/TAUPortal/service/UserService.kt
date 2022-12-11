package com.example.TAUPortal.service

import com.example.TAUPortal.models.User
import com.example.TAUPortal.repository.UserRepository
import kotlinx.coroutines.flow.Flow
import org.springframework.stereotype.Service

@Service
class UserService(val repository: UserRepository) {

    suspend fun findUsers(): Flow<User> {
        return repository.findAll()
    }
}