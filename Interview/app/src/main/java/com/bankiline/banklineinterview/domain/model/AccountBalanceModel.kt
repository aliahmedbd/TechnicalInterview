package com.bankiline.banklineinterview.domain.model

import com.bankiline.banklineinterview.data.dto.Balance
import com.bankiline.banklineinterview.data.dto.Money
import com.bankiline.banklineinterview.data.dto.Transaction

data class AccountBalanceModel(
    val balance: Balance,
    val money: Money,
    val period: String,
    val transactions: List<Transaction>
)