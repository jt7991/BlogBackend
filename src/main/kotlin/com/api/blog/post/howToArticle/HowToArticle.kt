package com.api.blog.post.howToArticle

import com.api.blog.post.Post
import javax.persistence.DiscriminatorValue
import javax.persistence.Entity

@Entity
@DiscriminatorValue("how-to")
class HowToArticle(): Post() {
}