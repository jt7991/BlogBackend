package com.api.blog.user

import com.api.blog.post.Post
import com.api.blog.post.blogPost.BlogPost
import com.api.blog.post.howToArticle.HowToArticle
import java.util.*
import javax.persistence.*
import kotlin.jvm.Transient

@Entity
@Table(name="`user`")
class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0;
    var username: String = "";
    var firstName: String = "";
    var lastName: String = "";
    var email: String = "";

    @OneToMany(mappedBy = "author", targetEntity = Post::class)
    var posts: List<Post> = emptyList()
}