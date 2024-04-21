package com.example.nestednavigationcompose_codingmeet.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.nestednavigationcompose_codingmeet.navigation.graphs.MainGraph

interface BottomNavigationDestination {
    val title: String
    val route: String
    val selectedIcon: ImageVector
    val unSelectedIcon: ImageVector
    val hasBadgeDot: Boolean
    val badgeCount: Int?
}
object Home : BottomNavigationDestination {
    override val title: String = "Home"
    override val route: String = MainGraph.Home.route
    override val selectedIcon: ImageVector = Icons.Filled.Home
    override val unSelectedIcon: ImageVector = Icons.Outlined.Home
    override val hasBadgeDot: Boolean = false
    override val badgeCount: Int? = null
}
object Profile : BottomNavigationDestination {
    override val title: String = "Profile"
    override val route: String = MainGraph.Profile.route
    override val selectedIcon: ImageVector = Icons.Filled.Person
    override val unSelectedIcon: ImageVector = Icons.Outlined.Person
    override val hasBadgeDot: Boolean = false
    override val badgeCount: Int? = null
}
object Notification : BottomNavigationDestination {
    override val title: String = "Notification"
    override val route: String = MainGraph.Notification.route
    override val selectedIcon: ImageVector = Icons.Filled.Notifications
    override val unSelectedIcon: ImageVector = Icons.Outlined.Notifications
    override val hasBadgeDot: Boolean = false
    override val badgeCount: Int = 9
}

object Setting : BottomNavigationDestination {
    override val title: String = "Setting"
    override val route: String = MainGraph.Setting.route
    override val selectedIcon: ImageVector = Icons.Filled.Settings
    override val unSelectedIcon: ImageVector = Icons.Outlined.Settings
    override val hasBadgeDot: Boolean = true
    override val badgeCount: Int? = null
}

val bottomNavigationDestinations = listOf(Home, Profile, Notification, Setting)