package com.crypto.koin.api

import javax.validation.Valid
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

data class Transaction(
    // random id
    @NotBlank
    @Size(min = 64, max = 64)
    val id: String,

    // hash taken from the contents of the transaction: sha256 (id + data)
    @NotBlank
    @Size(min = 64, max = 64)
    val hash: String?,

    // transaction type (regular, fee, reward)
    val type: TxType,

    @Valid
    val data: TxData
)
