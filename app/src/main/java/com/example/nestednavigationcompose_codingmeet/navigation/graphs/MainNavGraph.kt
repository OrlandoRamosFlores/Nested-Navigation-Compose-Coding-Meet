package com.example.nestednavigationcompose_codingmeet.navigation.graphs

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.nestednavigationcompose_codingmeet.navigation.Graph
import com.example.nestednavigationcompose_codingmeet.navigation.MainRouteScreen
import com.example.nestednavigationcompose_codingmeet.screens.main.HomeScreen
import com.example.nestednavigationcompose_codingmeet.screens.main.NotificationScreen
import com.example.nestednavigationcompose_codingmeet.screens.main.ProfileScreen
import com.example.nestednavigationcompose_codingmeet.screens.main.SettingScreen


@Composable
fun MainNavGraph(
    rootNavController: NavHostController,
    homeNavController: NavHostController,
    innerPadding: PaddingValues
) {
    NavHost(
        navController = homeNavController,
        route = Graph.MAIN_SCREEN_GRAPH,
        startDestination = MainRouteScreen.Home.route
    ) {
        composable(route = MainRouteScreen.Home.route) {
            HomeScreen(innerPadding = innerPadding)
        }
        composable(route = MainRouteScreen.Profile.route) {
            ProfileScreen(innerPadding = innerPadding)
        }
        composable(route = MainRouteScreen.Notification.route) {
            NotificationScreen(navController = rootNavController, innerPadding = innerPadding)
        }
        composable(route = MainRouteScreen.Setting.route) {
            SettingScreen(navController = rootNavController, innerPadding = innerPadding)
        }
    }
}