package com.bankiline.presentation.state

import com.bankiline.banklineinterview.domain.model.AccountBalanceModel

data class AccountBalanceState(
    val listAccountBalance: List<AccountBalanceModel>?=emptyList()
)