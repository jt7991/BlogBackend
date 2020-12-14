package com.api.blog.post

import org.springframework.beans.factory.annotation.Autowired
import javax.persistence.EntityManager

class PostRepositoryCustomImpl(@Autowired var entityManager: EntityManager): PostRepositoryCustom {
}