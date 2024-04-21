package com.example.nestednavigationcompose_codingmeet.navigation

object Graph {
    const val ROOT_GRAPH = "rootGraph"
    const val AUTH_GRAPH = "authGraph"
    const val MAIN_SCREEN_GRAPH = "mainScreenGraph"
    const val NOTIFICATION_GRAPH = "notificationGraph"
    const val SETTING_GRAPH = "settingGraph"
}

sealed class AuthRouteScreen(var route: String) {
    data object Login : AuthRouteScreen("login")
    data object SignUp : AuthRouteScreen("signUp")
    data object Forget : AuthRouteScreen("forget")
}

sealed class MainRouteScreen(var route: String) {
    data object Home : MainRouteScreen("home")
    data object Profile : MainRouteScreen("profile")
    data object Notification : MainRouteScreen("notification")
    data object Setting : MainRouteScreen("setting")
}

sealed class NotificationRouteScreen(var route: String) {
    data object NotificationDetail : NotificationRouteScreen("notificationDetail")
}

sealed class SettingRouteScreen(var route: String) {
    data object SettingDetail : SettingRouteScreen("settingDetail")
}