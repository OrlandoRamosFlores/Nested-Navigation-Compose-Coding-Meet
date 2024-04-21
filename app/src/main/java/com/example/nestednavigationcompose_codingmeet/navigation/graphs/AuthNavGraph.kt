package com.example.nestednavigationcompose_codingmeet.navigation.graphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.nestednavigationcompose_codingmeet.screens.auth.ForgotPasswordScreen
import com.example.nestednavigationcompose_codingmeet.screens.auth.LoginScreen
import com.example.nestednavigationcompose_codingmeet.screens.auth.SignUpScreen

fun NavGraphBuilder.authNavGraph(
    rootNavController: NavHostController
) {
    navigation(
        route = Graph.AUTH_GRAPH,
        startDestination = AuthGraph.Login.route
    ) {
        composable(route = AuthGraph.Login.route) {
            LoginScreen(
                onClickMainScreenGraph = {
                    rootNavController.navigate(Graph.MAIN_GRAPH) {
                        popUpTo(AuthGraph.Login.route) { inclusive = true }
                    }
                },
                onClickSignUpScreen = { rootNavController.navigate(AuthGraph.SignUp.route) },
                onClickForgotPasswordScreen = { rootNavController.navigate(AuthGraph.Forget.route) }
            )
        }
        composable(route = AuthGraph.SignUp.route) {
            SignUpScreen(
                onClickMainScreenGraph = {
                    rootNavController.navigate(Graph.MAIN_GRAPH) {
                        popUpTo(AuthGraph.SignUp.route) { inclusive = true }
                    }
                },
                onClickNavigateUp = { rootNavController.navigateUp() }
            )
        }
        composable(route = AuthGraph.Forget.route) {
            ForgotPasswordScreen(
                onClickNavigateUp = { rootNavController.navigateUp()}
            )
        }

    }
}
sealed class AuthGraph(var route: String) {
    data object Login : AuthGraph("login")
    data object SignUp : AuthGraph("sign_up")
    data object Forget : AuthGraph("forget")
}