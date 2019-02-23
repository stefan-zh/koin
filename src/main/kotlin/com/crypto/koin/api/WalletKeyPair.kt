package com.crypto.koin.api

import javax.validation.constraints.Min

data class WalletKeyPair(
    @Min(0)
    val index: Int
)
