package com.duoinc.vultur.mapper

import com.duoinc.vultur.domain.entity.ProfileEntity
import com.duoinc.vultur.domain.model.Profile

interface ProfileMapper {
    fun toEntity(profile: Profile) : ProfileEntity
    fun toModel(profileEntity: ProfileEntity) : Profile
}

class ProfileMapperImpl : ProfileMapper {
    override fun toEntity(profile: Profile): ProfileEntity {
        return ProfileEntity(
            profile.id,
            profile.userId,
            profile.username,
            profile.keywords
        )
    }

    override fun toModel(profileEntity: ProfileEntity): Profile {
        return Profile(
            profileEntity.id,
            profileEntity.userId,
            profileEntity.username,
            profileEntity.keywords
        )
    }

}