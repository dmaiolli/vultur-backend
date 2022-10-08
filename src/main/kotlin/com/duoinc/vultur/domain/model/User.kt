package com.duoinc.vultur.domain.model

data class User(
    val id: String,
    val profiles: List<Profile>
) {
}