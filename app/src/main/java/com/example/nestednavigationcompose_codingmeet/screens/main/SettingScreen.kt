package com.example.nestednavigationcompose_codingmeet.screens.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.nestednavigationcompose_codingmeet.navigation.graphs.SettingGraph

@Composable
fun SettingScreen(
    modifier: Modifier = Modifier,
    onClickSettingDetail: () -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Cyan),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Setting screen",
            fontSize = 40.sp,
            color = Color.Black
        )
        Button(
            onClick = onClickSettingDetail
        ) {
            Text(text = "Go to Setting Detail Page", fontSize = 20.sp)
        }
    }
}