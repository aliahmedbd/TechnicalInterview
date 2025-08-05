package com.bankiline.banklineinterview.domain.usescase

import com.bankiline.banklineinterview.core.resource.Resource
import com.bankiline.banklineinterview.domain.model.AccountBalanceModel
import com.bankiline.banklineinterview.domain.repository.AccountBalanceRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class AccountBalanceUseCases @Inject constructor(private val accountBalanceRepo: AccountBalanceRepository){
    operator  fun invoke() : Flow<Resource<List<AccountBalanceModel>>> =flow{
        val result=accountBalanceRepo.getAccountBalance().map{

        }



//        try {
//            emit(Resource.Loading())
//            val resultAccountBalance=accountBalanceRepo.getAccountBalance().map{
//
//            }
//        }catch (){
//
//        }



}


}