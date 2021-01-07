package com.api.blog.credentials

import javax.persistence.DiscriminatorValue
import javax.persistence.Entity

@Entity
@DiscriminatorValue("twitter")
class TwitterCredentials: Credentials() {
    val username: String = ""

    var login_token: String = "";

    override fun setDisplayedName() {
        this.displayedName = username
    }
}