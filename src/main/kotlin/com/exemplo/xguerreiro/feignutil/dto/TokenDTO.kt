package com.exemplo.xguerreiro.feignutil.dto

import com.exemplo.xguerreiro.feignutil.response.TokenResponse
import com.fasterxml.jackson.annotation.JsonProperty

data class TokenDTO (
    @JsonProperty("access_token")
    val accessToken: String,
    @JsonProperty("scope")
    val scope: String,
    @JsonProperty("token_type")
    val tokenType: String,
    @JsonProperty("expires_in")
    val expiresIn: String
)