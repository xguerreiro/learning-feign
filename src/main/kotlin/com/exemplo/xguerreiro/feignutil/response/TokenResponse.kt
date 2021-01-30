package com.exemplo.xguerreiro.feignutil.response

class TokenResponse (
        val accessToken: String,
        val scope: String,
        val tokenType: String,
        val expiresIn: String
)
