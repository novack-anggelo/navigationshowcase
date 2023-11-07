package com.novack.navigationshowcase.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import com.novack.navigationshowcase.util.AppState

@Composable
fun ShowcaseNavHost(
    appState: AppState,
    modifier: Modifier = Modifier,
    startDestination: String = homeNavigationRoute
) {
    val navController = appState.navController

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        homeScreen()
        profileScreen()
        settingsScreen()
    }
}