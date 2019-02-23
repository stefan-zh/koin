package com.crypto.koin.controller

import com.crypto.koin.api.Block
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.common.io.Resources
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/blockchain")
class BlockchainController(
    val objectMapper: ObjectMapper
) {

    @RequestMapping(value = ["/blocks"], method = [RequestMethod.GET])
    fun getAllBlocks(): List<Block> {
        val url = Resources.getResource("genesis-block.json")
        val genesis = objectMapper.readValue(url, Block::class.java)
        return listOf(genesis)
    }

}
