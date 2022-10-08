package com.duoinc.vultur.domain.model

data class Profile(
    val id: String,
    val userId: String,
    val username: String,
    val keywords: List<String>
) {
}