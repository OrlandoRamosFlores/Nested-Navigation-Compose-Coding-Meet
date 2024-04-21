package com.example.nestednavigationcompose_codingmeet.navigation.graphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.nestednavigationcompose_codingmeet.navigation.AuthRouteScreen
import com.example.nestednavigationcompose_codingmeet.navigation.Graph
import com.example.nestednavigationcompose_codingmeet.screens.auth.ForgotPasswordScreen
import com.example.nestednavigationcompose_codingmeet.screens.auth.LoginScreen
import com.example.nestednavigationcompose_codingmeet.screens.auth.SignUpScreen


fun NavGraphBuilder.authNavGraph(
    rootNavController: NavHostController
) {
    navigation(
        route = Graph.AUTH_GRAPH,
        startDestination = AuthRouteScreen.Login.route
    ) {
        composable(route = AuthRouteScreen.Login.route) {
            LoginScreen(
                onClickMainScreenGraph = {
                    rootNavController.navigate(Graph.MAIN_SCREEN_GRAPH) {
                        popUpTo(AuthRouteScreen.Login.route) { inclusive = true }
                    }
                },
                onClickSignUpScreen = { rootNavController.navigate(AuthRouteScreen.SignUp.route) },
                onClickForgotPasswordScreen = { rootNavController.navigate(AuthRouteScreen.Forget.route) }
            )
        }
        composable(route = AuthRouteScreen.SignUp.route) {
            SignUpScreen(
                onClickMainScreenGraph = {
                    rootNavController.navigate(Graph.MAIN_SCREEN_GRAPH) {
                        popUpTo(AuthRouteScreen.SignUp.route) { inclusive = true }
                    }
                },
                onClickNavigateUp = { rootNavController.navigateUp() }
            )
        }
        composable(route = AuthRouteScreen.Forget.route) {
            ForgotPasswordScreen(
                onClickNavigateUp = { rootNavController.navigateUp()}
            )
        }

    }
}