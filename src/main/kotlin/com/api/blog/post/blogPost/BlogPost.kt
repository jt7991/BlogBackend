package com.api.blog.post.blogPost

import com.api.blog.post.Post
import javax.persistence.DiscriminatorValue
import javax.persistence.Entity

@Entity
@DiscriminatorValue("blog")
class BlogPost(): Post() {
}