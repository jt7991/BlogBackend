package com.api.blog.credentials

import javax.persistence.DiscriminatorValue
import javax.persistence.Entity

@Entity
@DiscriminatorValue("local")
class LocalCredentials: Credentials() {
    val username: String = ""

    var password: String = "";

    override fun setDisplayedName() {
        this.displayedName = username
    }

}