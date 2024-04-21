package com.example.nestednavigationcompose_codingmeet.screens.main


import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.nestednavigationcompose_codingmeet.navigation.BottomNavigationBar
import com.example.nestednavigationcompose_codingmeet.navigation.bottomNavigationDestinations
import com.example.nestednavigationcompose_codingmeet.navigation.graphs.MainNavGraph
import com.example.nestednavigationcompose_codingmeet.navigation.graphs.navigateSingleTopTo


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
    rootNavHostController: NavHostController,
    homeNavController: NavHostController = rememberNavController()
) {

    val currentHomeBackStackEntry by homeNavController.currentBackStackEntryAsState()
    val currentDestination = currentHomeBackStackEntry?.destination
    val currentScreen = bottomNavigationDestinations.find { it.route == currentDestination?.route }
        ?: bottomNavigationDestinations[0]

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = currentScreen.title)
                },
                actions = { BottomNavigationActions(currentScreen = currentScreen.title)}
            )
        },
        bottomBar = {
            BottomNavigationBar(
                items = bottomNavigationDestinations,
                currentRoute = currentScreen.route,
                onClickItem = {
                    homeNavController.navigateSingleTopTo(it.route)
                }
            )
        }
    ) { innerPadding ->
        MainNavGraph(
            rootNavController = rootNavHostController,
            homeNavController = homeNavController,
            modifier = Modifier.padding(innerPadding)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun MainScreenPreview() {
    MainScreen(rootNavHostController = rememberNavController())
}