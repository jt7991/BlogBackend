package com.api.blog.post

import com.api.blog.toSlug
import com.api.blog.user.User
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="post_type")
abstract class Post(
    open val title: String = "",
    @Column(columnDefinition = "TEXT")
    open val body: String = "",
    @ManyToOne
    @JoinColumn(name = "author_id")
    open val author: User? = null
){
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    open val id: Long = 0

    @CreationTimestamp
    open val createdDate: LocalDateTime? = LocalDateTime.now()

    @UpdateTimestamp
    open val lastUpdated: LocalDateTime? = LocalDateTime.now()

    open var slug: String = ""

    @PrePersist
    fun setSlug(): Unit {
        this.slug = this.title.toSlug()
    }
}