package com.bankiline.banklineinterview.data.api

import com.bankiline.banklineinterview.data.dto.AccountBalanceDto

interface AccountBalanceApi {
    suspend fun getAccountBalance(): AccountBalanceDto
}