package com.crypto.koin.api

import javax.validation.Valid
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

data class Transaction(
    // random id
    @NotBlank
    @Size(min = 128, max = 128) // 1 byte = 2 hex characters, 64 bytes
    val id: String,

    // hash taken from the contents of the transaction: sha256 (id + data)
    @NotBlank
    @Size(min = 128, max = 128) // 64 bytes
    val hash: String?,

    // transaction type (regular, fee, reward)
    val type: TxType,

    @Valid
    val data: TxData
)
