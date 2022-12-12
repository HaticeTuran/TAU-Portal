package com.example.TAUPortal.controller

import kotlinx.coroutines.flow.Flow
import com.example.TAUPortal.models.User
import com.example.TAUPortal.service.UserService
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
    @GetMapping()
    suspend fun findUsers(): Flow<User> {
        return service.findUsers()
    }

    @GetMapping("/{id}")
    suspend fun findUserById(@PathVariable("id") id: UUID): User? {
        return service.findUserById(id)
    }

    // Post Methods
    @PostMapping()
    suspend fun saveUser(@RequestBody user: User){
        service.saveUser(user)
    }

    // Delete Methods
    @DeleteMapping("/{id}")
    suspend fun deleteComment(@PathVariable("id") id: UUID){
        service.deleteUserById(id)
    }

}