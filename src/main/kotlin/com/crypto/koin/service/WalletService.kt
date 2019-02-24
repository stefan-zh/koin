package com.crypto.koin.service

import com.crypto.koin.api.Wallet
import com.crypto.koin.api.WalletRequest
import com.crypto.koin.util.CryptoUtil
import org.springframework.stereotype.Service

@Service
class WalletService(
    val crypto: CryptoUtil
) {

    /**
     * Creates an instance of a Wallet
     */
    fun createWallet(request: WalletRequest): Wallet {
        return Wallet(
            id = crypto.randomId(),
            passwordHash = with(crypto) {
                request.password.hash()
            }
        )
    }

}
