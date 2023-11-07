package com.novack.navigationshowcase.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.novack.navigationshowcase.ProfileRoute

const val profileNavigationRoute = "profile"

fun NavController.navigateToProfile(navOptions: NavOptions? = null) {
    this.navigate(profileNavigationRoute, navOptions)
}

fun NavGraphBuilder.profileScreen() {
    composable(route = profileNavigationRoute) {
        ProfileRoute()
    }
}