package com.duoinc.vultur

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling


@SpringBootApplication
@EnableScheduling
class VulturApplication

fun main(args: Array<String>) {
	runApplication<VulturApplication>(*args)
}