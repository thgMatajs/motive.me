package com.gentalha.motiveme.ui.model

sealed class BottomNavigationRoutes(val name: String) {
    object Quote: BottomNavigationRoutes("Quote")
    object Favorite: BottomNavigationRoutes("Favorite")
    object Profile: BottomNavigationRoutes("Profile")
}
