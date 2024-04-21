package com.example.nestednavigationcompose_codingmeet.navigation.graphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.nestednavigationcompose_codingmeet.navigation.Graph
import com.example.nestednavigationcompose_codingmeet.navigation.NotificationRouteScreen
import com.example.nestednavigationcompose_codingmeet.screens.notification.NotificationDetailScreen


fun NavGraphBuilder.notificationNavGraph(rootNavController: NavHostController) {
    navigation(
        route = Graph.NOTIFICATION_GRAPH,
        startDestination = NotificationRouteScreen.NotificationDetail.route
    ) {
        composable(route = NotificationRouteScreen.NotificationDetail.route) {
            NotificationDetailScreen(navController = rootNavController)
        }
    }
}

