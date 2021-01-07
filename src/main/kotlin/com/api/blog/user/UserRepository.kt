package com.api.blog.user

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import java.util.*

@RepositoryRestResource
interface UserRepository: JpaRepository<User, Long> {
    fun findByFirstName(@Param("firstName") firstName: String?): List<User>
    fun findByLastName(@Param("lastName") lastName: String?): List<User>
    fun findByUsername(@Param("username") lastName: String?): List<User>
}