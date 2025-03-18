package com.bankiline.banklineinterview.ui.account

import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable

@Serializable
object AccountOverview

fun NavController.navigateToAccountOverview() = navigate(AccountOverview)

fun NavGraphBuilder.accountOverviewScreen(modifier: Modifier = Modifier) {
    composable<AccountOverview> {
        AccountOverviewScreen(modifier)
    }
}