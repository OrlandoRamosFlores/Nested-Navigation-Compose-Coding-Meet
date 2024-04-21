package com.example.nestednavigationcompose_codingmeet.navigation.graphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.nestednavigationcompose_codingmeet.screens.notification.NotificationDetailScreen


fun NavGraphBuilder.notificationNavGraph(rootNavController: NavHostController) {
    navigation(
        route = Graph.NOTIFICATION_GRAPH,
        startDestination = NotificationGraph.NotificationDetail.route
    ) {
        composable(route = NotificationGraph.NotificationDetail.route) {
            NotificationDetailScreen(
                onClickNavigateUp = { rootNavController.navigateUp() }
            )
        }
    }
}

sealed class NotificationGraph(var route: String) {
    data object NotificationDetail : NotificationGraph("notification_detail")
}
