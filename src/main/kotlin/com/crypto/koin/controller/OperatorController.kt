package com.crypto.koin.controller

import com.crypto.koin.api.WalletRequest
import com.crypto.koin.api.WalletResponse
import com.crypto.koin.service.WalletService
import com.crypto.koin.util.BadRequestException
import mu.KLogging
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
@RequestMapping("/operator")
class OperatorController(
    private val walletService: WalletService
) {

    companion object : KLogging()

    @RequestMapping(value = ["/wallets"], method = [RequestMethod.GET])
    fun getWallets() {
    }

    @RequestMapping(value = ["/wallets"], method = [RequestMethod.POST])
    fun createWallet(@RequestBody @Valid request: WalletRequest): WalletResponse {
        if (!request.password.matches(Regex("^(\\w+\\s+){4}(\\w|\\s)+\$"))) {
            throw BadRequestException("Password must contain more than 4 words")
        }
        val wallet = walletService.createWallet(request)
        return WalletResponse(wallet)
    }
}
