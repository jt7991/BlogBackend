package com.api.blog.credentials

import javax.persistence.DiscriminatorValue
import javax.persistence.Entity

@Entity
@DiscriminatorValue("facebook")
class FacebookCredentials: Credentials() {
    val firstName: String = ""
    val lastName: String = ""

    var login_token: String = "";

    override fun setDisplayedName() {
        this.displayedName = "$firstName $lastName"
    }

}