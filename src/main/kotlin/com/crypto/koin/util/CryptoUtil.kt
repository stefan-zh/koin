package com.crypto.koin.util

import com.fasterxml.jackson.databind.ObjectMapper
import com.google.common.hash.Hashing
import org.apache.tomcat.util.buf.HexUtils
import org.springframework.stereotype.Service
import java.nio.charset.StandardCharsets
import kotlin.random.Random

@Service
class CryptoUtil(
    private val objectMapper: ObjectMapper
) {

    /**
     * Produces SHA-256 hash for any object
     */
    fun Any.hash(): String {
        val str = objectMapper.writeValueAsString(this)
        return Hashing.sha256().hashString(str, StandardCharsets.UTF_8).toString()
    }

    /**
     * Creates a 64-character random Hex string
     */
    fun randomId(): String {
        return Random.nextBytes(32).toHexString()
    }
}

fun ByteArray.toHexString(): String {
    return HexUtils.toHexString(this)
}
