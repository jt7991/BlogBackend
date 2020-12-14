package com.api.blog.post

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.NoRepositoryBean
import org.springframework.data.repository.query.Param
import java.util.*

@NoRepositoryBean
interface PostRepository<T>: JpaRepository<T, Long> {
    fun findBySlug(@Param("slug") slug: String?): List<T>
    fun findByAuthor_UsernameAndTimestampBefore(@Param("authorUsername") author: String, @Param("timeBefore") timestamp: Date)
}