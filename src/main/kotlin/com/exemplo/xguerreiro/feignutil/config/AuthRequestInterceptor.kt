package com.exemplo.xguerreiro.feignutil.config

import com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER
import feign.RequestTemplate
import feign.RequestInterceptor

class AuthRequestInterceptor : RequestInterceptor {

    override fun apply(template: RequestTemplate) {
        template.header("Authorization", "Basic ZGVtby1iYWNrZW5kLWNsaWVudDpNSmxPM2JpbmF0RDlqazE=")
        LOGGER.info("authconfigurator authentication applied")
    }

}