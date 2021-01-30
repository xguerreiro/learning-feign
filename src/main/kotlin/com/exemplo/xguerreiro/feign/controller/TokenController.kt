package com.exemplo.xguerreiro.feign.controller

import com.exemplo.xguerreiro.feign.response.TokenResponse
import com.exemplo.xguerreiro.feign.service.TokenService
import org.springframework.util.LinkedMultiValueMap
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/token")
class TokenController(private val tokenService: TokenService) {

    @PostMapping("token/find")
    @ResponseBody
    fun findToken() : TokenResponse {

        val mapForm = LinkedMultiValueMap<String, String>()
        mapForm.add("grant_type", "client_credentials")
        mapForm.add("scope", "read")

        val tokenDTO = tokenService.findToken(mapForm);
        val tokenResponse = TokenResponse(tokenDTO.accessToken, tokenDTO.expiresIn, tokenDTO.scope, tokenDTO.tokenType)
        return tokenResponse
    }

}