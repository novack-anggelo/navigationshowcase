package com.novack.navigationshowcase.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.novack.navigationshowcase.HomeRoute

const val homeNavigationRoute = "home"

fun NavController.navigateToHome(navOptions: NavOptions? = null) {
    this.navigate(homeNavigationRoute, navOptions)
}

fun NavGraphBuilder.homeScreen() {
    composable(route = homeNavigationRoute) {
        HomeRoute()
    }
}