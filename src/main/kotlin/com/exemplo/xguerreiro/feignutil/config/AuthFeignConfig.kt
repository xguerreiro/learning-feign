package com.exemplo.xguerreiro.feignutil.config

import org.springframework.context.annotation.Bean

class AuthFeignConfig {

    @Bean
    fun authRequestInterceptor(): AuthRequestInterceptor {
        return AuthRequestInterceptor()
    }

}