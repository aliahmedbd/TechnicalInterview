package com.bankiline.banklineinterview.di

import com.bankiline.banklineinterview.core.utils.Constant
import com.bankiline.banklineinterview.data.api.AccountBalanceApi
import com.bankiline.banklineinterview.data.repository.AccountBalanceImplementation
import com.bankiline.banklineinterview.domain.repository.AccountBalanceRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(Singleton::class)
object AppModule {

    @Provides
    @Singleton
    fun provideRetrofit():AccountBalanceApi{
       return  Retrofit.Builder()
        .baseUrl(Constant.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(AccountBalanceApi::class.java)
    }

    @Provides
    @Singleton
    fun provideApiObject(api: AccountBalanceApi): AccountBalanceRepository{
        return AccountBalanceImplementation(api)
    }
}