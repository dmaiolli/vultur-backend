package com.duoinc.vultur.worker

import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import java.util.Date

@Component
class SearchKeywordsOnInstagramSchedule {

    @Scheduled(cron = "0/5 * * * * ?")
    fun everyThreeSeconds() {
        println("Periodic task: " + Date())
    }

}