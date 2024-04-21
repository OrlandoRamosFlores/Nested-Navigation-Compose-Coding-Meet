package com.example.nestednavigationcompose_codingmeet.screens.notification

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun NotificationDetailScreen(
    navController: NavController
) {
    Column(
        modifier = androidx.compose.ui.Modifier
            .fillMaxSize()
            .background(Color.Cyan),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Notification Detail Screen",
            fontSize = 35.sp,
            color = Color.Black
        )
        Button(
            onClick = {
                navController.navigateUp()
            }
        ) {
            Text(text = "Back to Main Screen", fontSize = 20.sp)
        }
    }
}