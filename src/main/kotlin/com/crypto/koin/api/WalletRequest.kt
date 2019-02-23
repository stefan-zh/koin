package com.crypto.koin.api

import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

data class WalletRequest(
    @NotBlank
    @Size(min = 2, max = 32)
    val password: String
)
