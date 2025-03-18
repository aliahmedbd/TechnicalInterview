package com.bankiline.banklineinterview.ui.account

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun AccountOverviewScreen(modifier: Modifier = Modifier) {

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "Account overview",
            fontWeight = FontWeight.Bold,
        )

        Spacer(modifier = Modifier.height(16.dp))

        // TODO: Fetch data from the API and display the values
        Text("Opening Balance: ?")
        Text("Closing Balance: ?")

        Spacer(modifier = Modifier.height(8.dp))

        // TODO: Fetch data from the API and display the values
        Text("Money in: ?")
        Text("Money out: ?")

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            // TODO: Navigate to the transaction screen
        }) {
            Text("View Transactions")
        }
    }

}


@Preview
@Composable
fun AccountOverviewScreenPreview() {
    AccountOverviewScreen()
}