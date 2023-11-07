package com.novack.navigationshowcase.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.List
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.List
import androidx.compose.material.icons.rounded.Person
import androidx.compose.ui.graphics.vector.ImageVector
import com.novack.navigationshowcase.R

enum class TopLevelDestination(
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val iconTextId: Int,
    val titleTextId: Int,
) {
    HOME(
        selectedIcon = Icons.Rounded.Home,
        unselectedIcon = Icons.Outlined.Home,
        iconTextId = R.string.HOME,
        titleTextId = R.string.HOME
    ),
    PROFILE(
        selectedIcon = Icons.Rounded.Person,
        unselectedIcon = Icons.Outlined.Person,
        iconTextId = R.string.PROFILE,
        titleTextId = R.string.PROFILE
    ),
    NEWS(
        selectedIcon = Icons.Rounded.List,
        unselectedIcon = Icons.Outlined.List,
        iconTextId = R.string.NEWS,
        titleTextId = R.string.NEWS
    )
}