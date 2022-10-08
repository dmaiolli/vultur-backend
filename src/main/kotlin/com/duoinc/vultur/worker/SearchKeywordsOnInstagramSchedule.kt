package com.duoinc.vultur.worker

import com.duoinc.vultur.domain.model.Profile
import com.duoinc.vultur.service.InstagramService
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import java.util.Date

@Component
class SearchKeywordsOnInstagramSchedule(private val instagramService: InstagramService) {

    @Scheduled(cron = "0/5 * * * * ?")
    fun everyThreeSeconds() {
        val profile = Profile("1", "1", "dmaiolli", listOf(""))
        println(instagramService.getProfileDescription(profile))
    }

}