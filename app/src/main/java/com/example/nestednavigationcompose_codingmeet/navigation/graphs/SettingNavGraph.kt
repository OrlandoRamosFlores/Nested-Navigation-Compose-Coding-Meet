package com.example.nestednavigationcompose_codingmeet.navigation.graphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.nestednavigationcompose_codingmeet.navigation.Graph
import com.example.nestednavigationcompose_codingmeet.navigation.SettingRouteScreen
import com.example.nestednavigationcompose_codingmeet.screens.setting.SettingDetailScreen

fun NavGraphBuilder.settingNavGraph(rootNavController: NavHostController) {
    navigation(
        route = Graph.SETTING_GRAPH,
        startDestination = SettingRouteScreen.SettingDetail.route
    ) {
        composable(route = SettingRouteScreen.SettingDetail.route) {
            SettingDetailScreen(rootNavController = rootNavController)
        }
    }
}
