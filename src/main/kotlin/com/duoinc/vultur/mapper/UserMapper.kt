package com.duoinc.vultur.mapper

import com.duoinc.vultur.domain.entity.UserEntity
import com.duoinc.vultur.domain.model.User

interface UserMapper {
    fun toEntity(user: User) : UserEntity
    fun toModel(userEntity: UserEntity) : User
}

class UserMapperImpl(private val profileMapper: ProfileMapper) : UserMapper {
    override fun toEntity(user: User): UserEntity {
        return UserEntity(
            user.id,
            user.profiles.map { profileMapper.toEntity(it) }
        )
    }

    override fun toModel(userEntity: UserEntity): User {
        return User(
            userEntity.id,
            userEntity.profiles.map { profileMapper.toModel(it) }
        )
    }

}