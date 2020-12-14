package com.api.blog.post

import com.api.blog.toSlug
import com.api.blog.user.User
import java.util.*
import javax.persistence.*

@MappedSuperclass
@EntityListeners(PostEntityListener::class)
open class Post(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,
    var title: String = "",
    var slug: String = title.toSlug(),
    @Column(columnDefinition = "TEXT")
    var body: String = "",
    @ManyToOne
    @JoinColumn(name = "author_id")
    var author: User? = null
){
    @Temporal(TemporalType.TIMESTAMP)
    var timestamp: Date = Date();
}