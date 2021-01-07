package com.api.blog.publication

import org.springframework.stereotype.Service

@Service
class PublicationService  {
    fun publishAll(publications: List<Publication>){
        for (publication in publications){
            publication.publish()
        }
    }
}