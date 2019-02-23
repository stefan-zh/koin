package com.crypto.koin.controller

import com.crypto.koin.api.WalletRequest
import mu.KLogging
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
@RequestMapping("/operator")
class OperatorController {

    companion object : KLogging()

    @RequestMapping(value = ["/wallets"], method = [RequestMethod.GET])
    fun getWallets() {
    }

    @RequestMapping(value = ["/wallets"], method = [RequestMethod.POST])
    fun createWallet(@RequestBody @Valid request: WalletRequest) {
        logger.info { request }
    }
}
