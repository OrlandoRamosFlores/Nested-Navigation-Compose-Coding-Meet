package com.example.nestednavigationcompose_codingmeet.navigation.graphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.nestednavigationcompose_codingmeet.screens.setting.SettingDetailScreen

fun NavGraphBuilder.settingNavGraph(rootNavController: NavHostController) {
    navigation(
        route = Graph.SETTING_GRAPH,
        startDestination = SettingGraph.SettingDetail.route
    ) {
        composable(route = SettingGraph.SettingDetail.route) {
            SettingDetailScreen(
                onClickAuthGraph = {
                    rootNavController.navigate(AuthGraph.Login.route){
                        popUpTo(Graph.MAIN_GRAPH){
                            inclusive = true
                        }
                        launchSingleTop = true
                    }
                }
            )
        }
    }
}

sealed class SettingGraph(var route: String) {
    data object SettingDetail : SettingGraph("setting_detail")
}
