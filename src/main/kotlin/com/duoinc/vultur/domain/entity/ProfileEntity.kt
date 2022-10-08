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
    @ElementCollection(targetClass = String::class)
    val keywords: List<String>
) {
}