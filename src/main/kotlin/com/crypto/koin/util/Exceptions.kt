package com.crypto.koin.util

import org.springframework.http.HttpStatus
import org.springframework.web.server.ResponseStatusException

class BadRequestException(msg: String) : ResponseStatusException(HttpStatus.BAD_REQUEST, msg)
