package com.bankiline.banklineinterview.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.navigation
import com.bankiline.banklineinterview.ui.account.AccountOverview
import com.bankiline.banklineinterview.ui.account.accountOverviewScreen
import kotlinx.serialization.Serializable

@Serializable
object BanklineTransaction

@Composable
fun NavGraph(
    modifier: Modifier = Modifier,
    navController: NavHostController,
) {
    NavHost(navController = navController, startDestination = BanklineTransaction) {
        navigation<BanklineTransaction>(
            startDestination = AccountOverview
        ) {
            accountOverviewScreen(modifier)
        }
    }

}