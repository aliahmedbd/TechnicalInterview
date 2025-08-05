package com.bankiline.banklineinterview.data.repository

import com.bankiline.banklineinterview.data.api.AccountBalanceApi
import com.bankiline.banklineinterview.data.dto.AccountBalanceDto
import com.bankiline.banklineinterview.domain.repository.AccountBalanceRepository
import javax.inject.Inject

class AccountBalanceImplementation @Inject constructor(private val accountApi: AccountBalanceApi) : AccountBalanceRepository{
    override suspend fun getAccountBalance(): AccountBalanceDto {
      return accountApi.getAccountBalance()
    }
}