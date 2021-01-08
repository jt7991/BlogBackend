package com.api.blog.publication

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PublicationController {
    @Autowired
    lateinit var publicationService: PublicationService

    @PostMapping("publish")
    fun publishPost(publicationList: List<Publication>){
        publicationService.publishAll(publicationList)
    }

}