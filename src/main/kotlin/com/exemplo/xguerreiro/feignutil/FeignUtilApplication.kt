package com.exemplo.xguerreiro.feignutil

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class FeignUtilApplication

fun main(args: Array<String>) {
	runApplication<FeignUtilApplication>(*args)
}
