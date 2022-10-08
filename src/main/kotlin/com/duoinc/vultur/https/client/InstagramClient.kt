package com.duoinc.vultur.https.client

import org.springframework.cloud.netflix.feign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@FeignClient("instagram-client")
interface InstagramClient {

    @GetMapping("www.instagram.com/{username}")
    fun getInstagramProfile(@RequestParam("username") username: String) : String

}