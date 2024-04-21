package com.example.nestednavigationcompose_codingmeet.navigation.graphs

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.nestednavigationcompose_codingmeet.navigation.Graph
import com.example.nestednavigationcompose_codingmeet.screens.main.MainScreen


@Composable
fun RootNavGraph(
    isAuth : Boolean
) {
    val rootNavController = rememberNavController()

    NavHost(
        navController = rootNavController,
        route = Graph.ROOT_GRAPH,
        startDestination = if (isAuth) Graph.MAIN_SCREEN_GRAPH else Graph.AUTH_GRAPH
    ){
        authNavGraph(rootNavController = rootNavController)
        composable(route = Graph.MAIN_SCREEN_GRAPH){
            MainScreen(rootNavHostController = rootNavController)
        }
        notificationNavGraph(rootNavController = rootNavController)
        settingNavGraph(rootNavController = rootNavController)
    }
}