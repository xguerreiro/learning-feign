package com.exemplo.xguerreiro.feignutil.service

import com.exemplo.xguerreiro.feignutil.config.AuthFeignConfig
import com.exemplo.xguerreiro.feignutil.dto.TokenDTO
import feign.Headers
import feign.Param
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.util.MultiValueMap
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.ResponseBody

@FeignClient("tokenService", url = "https://login-demo.curity.io/oauth", configuration = [AuthFeignConfig::class])
interface TokenService {

    @PostMapping("/v2/oauth-token", consumes = ["application/x-www-form-urlencoded"])
    @ResponseBody
    fun findToken(formParams : MultiValueMap<String,String>): TokenDTO
}

