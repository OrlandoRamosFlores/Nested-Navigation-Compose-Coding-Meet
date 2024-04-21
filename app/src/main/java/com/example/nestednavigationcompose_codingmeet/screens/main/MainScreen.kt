package com.example.nestednavigationcompose_codingmeet.screens.main


import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.nestednavigationcompose_codingmeet.navigation.BottomNavigationBar
import com.example.nestednavigationcompose_codingmeet.navigation.graphs.MainNavGraph
import com.example.nestednavigationcompose_codingmeet.utils.bottomNavigationItemsList


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
    rootNavHostController: NavHostController,
    homeNavController: NavHostController = rememberNavController()
) {

    val currentHomeBackStackEntry by homeNavController.currentBackStackEntryAsState()
    val currentDestination = currentHomeBackStackEntry?.destination
    val currentScreen = bottomNavigationItemsList.find { it.route == currentDestination?.route }
        ?: bottomNavigationItemsList[0]

    Scaffold(
        topBar = {
            TopAppBar(title = {
                Text(text = currentScreen.title)
            })
        },
        bottomBar = {
            BottomNavigationBar(
                items = bottomNavigationItemsList,
                currentRoute = currentScreen.route
            ) { currentNavigationItem ->
                homeNavController.navigate(currentNavigationItem.route) {
                    // Pop up to the start destination of the graph to
                    // avoid building up a large stack of destinations
                    // on the back stack as users select items
                    homeNavController.graph.startDestinationRoute?.let {
                        // Pop up to the start destination , clearing the back stack
                        popUpTo(it) {
                            // Save the state of popped destinations
                            saveState = true
                        }
                    }
                    // Configure navigation to avoid multiple instances of the same destination
                    launchSingleTop = true
                    // Restore state when re-selecting a previously selected item
                    restoreState = true
                }

            }
        }
    ) { innerPadding ->
        MainNavGraph(
            rootNavController = rootNavHostController,
            homeNavController = homeNavController,
            innerPadding = innerPadding
        )
    }
}