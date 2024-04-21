package com.example.nestednavigationcompose_codingmeet.navigation.graphs

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.nestednavigationcompose_codingmeet.screens.main.HomeScreen
import com.example.nestednavigationcompose_codingmeet.screens.main.NotificationScreen
import com.example.nestednavigationcompose_codingmeet.screens.main.ProfileScreen
import com.example.nestednavigationcompose_codingmeet.screens.main.SettingScreen


@Composable
fun MainNavGraph(
    rootNavController: NavHostController,
    homeNavController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = homeNavController,
        route = Graph.MAIN_GRAPH,
        startDestination = MainGraph.Home.route
    ) {
        composable(route = MainGraph.Home.route) {
            HomeScreen(modifier = modifier)
        }
        composable(route = MainGraph.Profile.route) {
            ProfileScreen(modifier = modifier)
        }
        composable(route = MainGraph.Notification.route) {
            NotificationScreen(
                modifier = modifier,
                onClickNotificationDetail = { rootNavController.navigate(Graph.NOTIFICATION_GRAPH) }
            )
        }
        composable(route = MainGraph.Setting.route) {
            SettingScreen(
                modifier = modifier,
                onClickSettingDetail = { rootNavController.navigate(Graph.SETTING_GRAPH) }
            )
        }
    }
}

fun NavHostController.navigateSingleTopTo(route: String) =
    this.navigate(route) {
        popUpTo(
            this@navigateSingleTopTo.graph.findStartDestination().id
        ) {
            saveState = true
        }
        launchSingleTop = true
        restoreState = true
    }

sealed class MainGraph(var route: String) {
    data object Home : MainGraph("home")
    data object Profile : MainGraph("profile")
    data object Notification : MainGraph("notification")
    data object Setting : MainGraph("setting")
}