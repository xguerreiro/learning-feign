package com.exemplo.xguerreiro.feign.service

import com.exemplo.xguerreiro.feign.config.AuthFeignConfig
import com.exemplo.xguerreiro.feign.dto.TokenDTO
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.util.MultiValueMap
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.ResponseBody

@FeignClient("tokenService", url = "\${service.token.host}", configuration = [AuthFeignConfig::class])
interface TokenService {

    @PostMapping("\${service.token.uri}", consumes = ["application/x-www-form-urlencoded"])
    @ResponseBody
    fun findToken(formParams : MultiValueMap<String,String>): TokenDTO
}

