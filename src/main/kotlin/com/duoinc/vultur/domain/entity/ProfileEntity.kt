package com.duoinc.vultur.domain.entity

import javax.persistence.*

@Entity
@Table(name = "profile")
data class ProfileEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    val id: String,
    @ManyToOne(targetEntity = UserEntity::class)
    val userId: String,
    val username: String,
    val keywords: List<String>
) {
}