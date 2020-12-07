package com.api.blog.post

import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "posts", path = "posts")
public interface PostRepository: PagingAndSortingRepository<Post, Long> {
    fun findByTitle(@Param("title") title: String?): List<Post>

}