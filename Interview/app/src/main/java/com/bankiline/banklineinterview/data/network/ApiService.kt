package com.bankiline.banklineinterview.data.network// ApiService.kt
import com.bankiline.banklineinterview.data.model.AccountOverview
import retrofit2.http.GET

interface ApiService {
    @GET("URL_PATH") // TODO Provide URL path
    suspend fun getAccountOverview(): AccountOverview
}