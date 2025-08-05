package com.bankiline.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.bankiline.banklineinterview.core.resource.Resource
import com.bankiline.banklineinterview.domain.usescase.AccountBalanceUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class AccountBalanceViewModel @Inject constructor(private val useCases: AccountBalanceUseCases):
    ViewModel(){
        private val _uiState= MutableStateFlow()

        init {
            getAccountBalance()
        }
    private fun getAccountBalance(){
        useCases().onEach {
            when(it){
                is Resource.Error<*> -> {
                }

                is Resource.Loading<*> ->{

                }
                is Resource.Success<*> -> {

                }
            }

        }
    }
}