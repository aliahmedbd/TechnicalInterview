package com.bankiline.banklineinterview.data.dto

data class AccountBalanceDto(
    val balance: Balance,
    val money: Money,
    val period: String,
    val transactions: List<Transaction>
)