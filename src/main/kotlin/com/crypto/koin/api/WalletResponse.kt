package com.crypto.koin.api

data class WalletResponse(
    val id: String,
    val addresses: List<String>
) {
    constructor(wallet: Wallet) : this(
        id = wallet.id,
        addresses = wallet.keyPairs.map { it.publicKey }
    )
}
