package com.novack.navigationshowcase.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.novack.navigationshowcase.SettingsRoute

const val settingsNavigationRoute = "settings"

fun NavController.navigateToSettings(navOptions: NavOptions? = null) {
    this.navigate(settingsNavigationRoute, navOptions)
}

fun NavGraphBuilder.settingsScreen() {
    composable(route = settingsNavigationRoute) {
        SettingsRoute()
    }
}