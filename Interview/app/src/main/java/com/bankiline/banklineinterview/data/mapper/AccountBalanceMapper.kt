package com.bankiline.banklineinterview.data.mapper

import com.bankiline.banklineinterview.data.dto.AccountBalanceDto
import com.bankiline.banklineinterview.domain.model.AccountBalanceModel

fun AccountBalanceDto.AccountBalancetoDomain(): AccountBalanceModel {
    return AccountBalanceModel(balance,money,period,transactions)
}