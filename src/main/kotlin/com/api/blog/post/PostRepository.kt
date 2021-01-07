package com.api.blog.post

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.NoRepositoryBean
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.format.annotation.DateTimeFormat
import java.util.*
@RepositoryRestResource
interface PostRepository<T:Post>: JpaRepository<T, Long> {
    fun findBySlug(@Param("slug") slug: String?): List<T>
    fun findByAuthor_UsernameAndCreatedDateAfter(@Param("authorUsername") author: String, @Param("createdDate") @DateTimeFormat(pattern = "yyyy-MM-dd") createdDate: Date): List<T>
}