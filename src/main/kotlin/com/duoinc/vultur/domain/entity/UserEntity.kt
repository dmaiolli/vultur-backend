package com.duoinc.vultur.domain.entity

import javax.persistence.*

@Entity
@Table(name = "user")
data class UserEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    val id: String,
    @OneToMany(mappedBy = "userId")
    val profiles: List<ProfileEntity>
)