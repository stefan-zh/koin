package com.crypto.koin.api

import java.math.BigDecimal
import javax.validation.constraints.Min
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

data class TxOutput(
    @Min(0)
    val amount: BigDecimal,

    // to address or change address
    @NotBlank
    @Size(min = 128, max = 128) // 1 byte = 2 hex characters, 64 bytes
    val address: String
)
