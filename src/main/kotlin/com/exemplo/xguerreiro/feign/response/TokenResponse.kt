package com.exemplo.xguerreiro.feign.response

class TokenResponse (
        val accessToken: String,
        val scope: String,
        val tokenType: String,
        val expiresIn: String
)
