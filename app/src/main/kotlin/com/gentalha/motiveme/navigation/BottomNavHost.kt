package com.gentalha.motiveme.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.gentalha.motiveme.feature.quote.presentation.viewmodel.MessageViewModel
import com.gentalha.motiveme.ui.model.BottomNavigationRoutes
import com.gentalha.motiveme.ui.screens.FavoriteScreen
import com.gentalha.motiveme.ui.screens.ProfileScreen
import com.gentalha.motiveme.ui.screens.QuoteScreen

@Composable
fun BottomNavHost(navController: NavHostController, viewModel: MessageViewModel) {
    NavHost(
        navController = navController,
        startDestination = BottomNavigationRoutes.Quote.name
    ) {
        composable(BottomNavigationRoutes.Quote.name) {
            QuoteScreen(viewModel = viewModel)
        }
        composable(BottomNavigationRoutes.Favorite.name) {
            FavoriteScreen()
        }
        composable(BottomNavigationRoutes.Profile.name) {
            ProfileScreen()
        }
    }
}