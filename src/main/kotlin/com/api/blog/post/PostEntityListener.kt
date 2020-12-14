package com.api.blog.post

import com.api.blog.toSlug
import javax.persistence.PostLoad
import javax.persistence.PostPersist
import javax.persistence.PostUpdate

open class PostEntityListener {
    @PostLoad
    fun setSlug(post: Post){
        post.slug = post.title.toSlug()
    }
}