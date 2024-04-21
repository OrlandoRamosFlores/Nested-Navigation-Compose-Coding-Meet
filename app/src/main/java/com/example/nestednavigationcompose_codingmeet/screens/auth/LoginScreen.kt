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
fun LoginScreen(
    onClickMainScreenGraph: () -> Unit = {},
    onClickSignUpScreen: () -> Unit = {},
    onClickForgotPasswordScreen: () -> Unit = {}
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
            .padding(top = 96.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        HeaderAuth("Login")
        OutlinedTextFieldAuth("Email")
        OutlinedTextFieldAuth("Password")
        ButtonAuth("Login", onClickMainScreenGraph)
        TextButtonAuth("Don't have an account? Register", onClickSignUpScreen)
        TextButtonAuth("Forgot Password", onClickForgotPasswordScreen)
    }
}
@Preview(showBackground = true)
@Composable
private fun LoginScreenPreview() {
    LoginScreen()
}


