package com.duoinc.vultur.https.client

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@Component
@FeignClient("instagram-client")
interface InstagramClient {

    @GetMapping("www.instagram.com/{username}")
    fun getInstagramProfile(@RequestParam("username") username: String) : String

}