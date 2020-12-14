package com.api.blog.post.howToArticle

import com.api.blog.post.PostRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "how-to", path = "how-to")
interface HowToArticleRepository: PostRepository<HowToArticle>{
}