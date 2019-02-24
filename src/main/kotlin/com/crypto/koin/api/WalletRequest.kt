package com.crypto.koin.api

import javax.validation.constraints.NotBlank

data class WalletRequest(
    @NotBlank
    val password: String
)
