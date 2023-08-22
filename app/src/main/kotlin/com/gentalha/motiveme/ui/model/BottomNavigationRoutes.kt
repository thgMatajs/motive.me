package com.gentalha.motiveme.ui.model

sealed class BottomNavigationRoutes(val label: String, val route: String) {
    object Quote: BottomNavigationRoutes("Quote", "quote_route")
    object Favorite: BottomNavigationRoutes("Favorite", "favorite_route")
    object Profile: BottomNavigationRoutes("Profile", "profile_route")
}
