package com.crypto.koin.api

import javax.validation.Valid
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

data class Wallet(
    @NotBlank
    @Size(min = 64, max = 64)
    val id: String,

    @NotBlank
    @Size(min = 64, max = 64)
    val passwordHash: String,

    @NotBlank
    @Size(min = 1024, max = 1204)
    var secret: String? = null,

    @Valid
    var keyPairs: List<WalletKeyPair> = emptyList()
)
