package com.duoinc.vultur.service

import com.duoinc.vultur.domain.model.Profile
import com.duoinc.vultur.https.client.InstagramClient
import org.springframework.stereotype.Service

@Service
class InstagramService(private val instagramClient: InstagramClient) {

    fun getProfileDescription(profile: Profile) {
        instagramClient.getInstagramProfile(profile.username)
    }
}