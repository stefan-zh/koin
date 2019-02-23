package com.crypto.koin.configuration

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary

@Configuration
class KoinConfiguration {
    @Bean
    @Primary
    fun objectMapper() = jacksonObjectMapper()
}
