package com.crypto.koin.api

import java.math.BigInteger
import java.sql.Timestamp
import javax.validation.Valid
import javax.validation.constraints.Min
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

data class Block(
    // index (first block: 0)
    @Min(0)
    val index: BigInteger,

    // hash taken from the contents of the block: sha256 (index + previousHash + timestamp + nonce + transactions)
    @NotBlank
    @Size(min = 64, max = 64)
    val hash: String?,

    // hash of previous block, first block is 0
    @NotBlank
    @Size(min = 64, max = 64)
    val previousHash: String,

    val timestamp: Timestamp,

    // nonce used to identify the proof-of-work step.
    @Min(0)
    val nonce: BigInteger,

    @Valid
    val transactions: List<Transaction>
)
