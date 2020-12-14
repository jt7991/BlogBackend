package com.api.blog.user

import com.api.blog.post.Post
import com.api.blog.post.blogPost.BlogPost
import com.api.blog.post.howToArticle.HowToArticle
import java.util.*
import javax.persistence.*

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
    @OneToMany(mappedBy = "author")
    var blogPosts: List<BlogPost?> = emptyList();
    @OneToMany(mappedBy = "author")
    var howToPosts: List<HowToArticle?> = emptyList();
}