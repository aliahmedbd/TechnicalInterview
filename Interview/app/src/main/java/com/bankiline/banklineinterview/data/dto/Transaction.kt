package com.bankiline.banklineinterview.data.dto

data class Transaction(
    val amount: Double,
    val balance: Double,
    val date: String,
    val description: String,
    val type: String
)