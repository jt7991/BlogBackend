package com.api.blog.post

import javax.persistence.*


@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private val id: Long = 0
    var title: String = "";
    var body: String = "";
}