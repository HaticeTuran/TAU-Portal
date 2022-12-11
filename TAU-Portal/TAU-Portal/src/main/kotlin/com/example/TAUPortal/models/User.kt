package com.example.TAUPortal.models

import org.springframework.data.annotation.Id
import java.util.*
import org.springframework.data.relational.core.mapping.Table
import org.springframework.data.relational.core.mapping.Column

@Table("Users")
data class User(
        @Id @Column("user_id") val user_id: UUID,
        @Column("name") val name: String,
        @Column("surname")val surname: String,
        @Column("mail")var mail: String,
        @Column("password")var password: String,
        @Column("tel_no")var tel_no: String,
        @Column("role")var role: String
)