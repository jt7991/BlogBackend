package com.api.blog.credentials

import javax.persistence.*
import kotlin.jvm.Transient

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="credential_type")
abstract class Credentials {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    open val id: Long = 0

    @Transient
    var displayedName: String = "";

    @PostLoad
    abstract fun setDisplayedName()
}