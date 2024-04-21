package com.example.nestednavigationcompose_codingmeet.screens.setting

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
import com.example.nestednavigationcompose_codingmeet.navigation.graphs.AuthGraph
import com.example.nestednavigationcompose_codingmeet.navigation.graphs.Graph

@Composable
fun SettingDetailScreen(
    onClickAuthGraph: () -> Unit
) {
    Column(
        modifier = androidx.compose.ui.Modifier
            .fillMaxSize()
            .background(Color.Cyan),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Setting Detail Screen",
            fontSize = 40.sp,
            color = Color.Black
        )
        Button(
            onClick = onClickAuthGraph
        ) {
            Text(text = "Go to Login", fontSize = 20.sp)
        }
    }
}