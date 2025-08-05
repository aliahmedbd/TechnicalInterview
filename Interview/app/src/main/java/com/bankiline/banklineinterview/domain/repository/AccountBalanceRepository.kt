package com.bankiline.banklineinterview.domain.repository

import com.bankiline.banklineinterview.data.dto.AccountBalanceDto

interface AccountBalanceRepository {
    suspend fun  getAccountBalance():AccountBalanceDto
}