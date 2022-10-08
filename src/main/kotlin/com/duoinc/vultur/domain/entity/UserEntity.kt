package com.duoinc.vultur.domain.entity

import javax.persistence.Entity
import javax.persistence.OneToMany
import javax.persistence.Table

@Entity
@Table(name = "user")
data class UserEntity(
    val id: String,
    @OneToMany(mappedBy = "userId")
    val profiles: List<ProfileEntity>
)