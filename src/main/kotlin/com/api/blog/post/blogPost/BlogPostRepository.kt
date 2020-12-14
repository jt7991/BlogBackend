package com.api.blog.post.blogPost

import com.api.blog.post.PostRepository
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "blog-posts", path = "blog-posts")
interface BlogPostRepository: PostRepository<BlogPost>{
}