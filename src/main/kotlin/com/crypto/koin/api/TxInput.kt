package com.crypto.koin.api

import java.math.BigDecimal
import javax.validation.constraints.Min
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

data class TxInput(
    // transaction hash taken from a previous unspent transaction output
    @NotBlank
    @Size(min = 64, max = 64)
    val transaction: String,

    // index of the transaction taken from a previous unspent transaction output
    @NotBlank
    @Size(min = 64, max = 64)
    val index: String,

    @Min(0)
    val amount: BigDecimal,

    // from address
    @NotBlank
    @Size(min = 64, max = 64)
    val address: String,

    // transaction input hash: sha256 (transaction + index + amount + address) signed with owner address's secret key
    @NotBlank
    @Size(min = 128, max = 128)
    val signature: String
)
