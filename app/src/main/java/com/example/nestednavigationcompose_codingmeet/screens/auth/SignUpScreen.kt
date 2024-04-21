package com.example.nestednavigationcompose_codingmeet.screens.auth

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SignUpScreen(
    onClickMainScreenGraph: () -> Unit = {},
    onClickNavigateUp: () -> Unit = {}
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .padding(top = 100.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        HeaderAuth("Register")
        OutlinedTextFieldAuth("Email")
        OutlinedTextFieldAuth("Password")
        OutlinedTextFieldAuth("Confirm Password")
        ButtonAuth("Register", onClickMainScreenGraph)
        TextButtonAuth("Already have an account? Login", onClickNavigateUp)
    }
}

@Preview(showBackground = true)
@Composable
private fun SignUpScreenPreview() {
    SignUpScreen()
}