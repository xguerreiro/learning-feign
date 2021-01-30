package com.exemplo.xguerreiro.feign.config

import feign.FeignException
import org.json.JSONObject
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

import javax.servlet.http.HttpServletResponse

@RestControllerAdvice
class FeignExceptionHandler {

    @ExceptionHandler(FeignException.BadRequest::class)
    fun handleFeignStatusException(e: FeignException, response: HttpServletResponse): Map<String, Any> {
        response.status = e.status()
        return JSONObject(e.contentUTF8()).toMap()
    }

}