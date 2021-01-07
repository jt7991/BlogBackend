package com.api.blog.publication

import com.api.blog.credentials.Credentials
import com.api.blog.post.Post

class Publication(type: PublicationType, var post: Post, var credentials: Credentials) {
    fun publish() {
        print("Published ${post.title} to ${credentials.javaClass.name}")
    }
}