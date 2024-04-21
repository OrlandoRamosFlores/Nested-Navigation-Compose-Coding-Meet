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
            LoginScreen(navController = rootNavController)
        }
        composable(route = AuthRouteScreen.SignUp.route) {
            SignUpScreen(navController = rootNavController)
        }
        composable(route = AuthRouteScreen.Forget.route) {
            ForgotPasswordScreen(navController = rootNavController)
        }

    }
}