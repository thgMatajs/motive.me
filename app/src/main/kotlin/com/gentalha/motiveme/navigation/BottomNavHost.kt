package com.gentalha.motiveme.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.gentalha.motiveme.feature.quote.presentation.viewmodel.MessageViewModel
import com.gentalha.motiveme.ui.model.BottomNavigationRoutes
import com.gentalha.motiveme.ui.screens.FavoriteScreen
import com.gentalha.motiveme.ui.screens.ProfileScreen
import com.gentalha.motiveme.ui.screens.QuoteScreen

@Composable
fun BottomNavHost(
    navController: NavHostController,
    viewModel: MessageViewModel,
    padding: PaddingValues
) {
    NavHost(
        modifier = Modifier.padding(padding),
        navController = navController,
        startDestination = BottomNavigationRoutes.Quote.route
    ) {
        composable(BottomNavigationRoutes.Quote.route) {
            QuoteScreen(viewModel = viewModel)
        }
        composable(BottomNavigationRoutes.Favorite.route) {
            FavoriteScreen(viewModel)
        }
        composable(BottomNavigationRoutes.Profile.route) {
            ProfileScreen()
        }
    }
}