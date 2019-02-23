package com.crypto.koin.api

import javax.validation.Valid

data class TxData(
    // Transaction inputs
    @Valid
    val inputs: List<TxInput>,

    // Transaction outputs
    @Valid
    val outputs: List<TxOutput>
)
