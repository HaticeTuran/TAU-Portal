package com.example.TAUPortal.repository


import com.example.TAUPortal.models.User
import org.springframework.stereotype.Repository
import java.util.UUID
import org.springframework.data.repository.kotlin.CoroutineCrudRepository

@Repository
interface UserRepository : CoroutineCrudRepository<User, UUID> {


}