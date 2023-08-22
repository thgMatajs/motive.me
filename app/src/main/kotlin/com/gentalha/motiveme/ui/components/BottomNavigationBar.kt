package com.gentalha.motiveme.ui.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FormatQuote
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.FormatQuote
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.gentalha.motiveme.ui.model.BottomNavigationItem
import com.gentalha.motiveme.ui.model.BottomNavigationRoutes
import com.gentalha.motiveme.ui.theme.GreyNeutral

@Composable
fun BottomNavigationBar(
    navController: NavHostController
) {
    val navItems = listOf(
        BottomNavigationItem(
            BottomNavigationRoutes.Quote.label,
            Icons.Filled.FormatQuote,
            Icons.Outlined.FormatQuote,
            BottomNavigationRoutes.Quote.route
        ),
        BottomNavigationItem(
            BottomNavigationRoutes.Favorite.label,
            Icons.Filled.Favorite,
            Icons.Outlined.FavoriteBorder,
            BottomNavigationRoutes.Favorite.route
        ),
        BottomNavigationItem(
            BottomNavigationRoutes.Profile.label,
            Icons.Filled.Person,
            Icons.Outlined.Person,
            BottomNavigationRoutes.Profile.route
        )
    )
    var selectedItemIndex by rememberSaveable {
        mutableIntStateOf(0)
    }
    NavigationBar(
        modifier = Modifier
            .clip(
                RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp)
            ),
        containerColor = GreyNeutral
    ) {
        navItems.forEachIndexed { index, item ->
            NavigationBarItem(
                selected = index == selectedItemIndex,
                onClick = {
                    selectedItemIndex = index
                    navController.navigate(item.route) {
                        popUpTo(navController.graph.id) {
                            saveState = true
                            inclusive = true
                        }
                    }
                },
                icon = {
                    Icon(
                        imageVector = if (selectedItemIndex == index) item.selectedIcon else item.unselectedIcon,
                        contentDescription = item.route
                    )
                },
                label = {
                    Text(
                        text = item.title,
                        fontWeight = if (selectedItemIndex == index) FontWeight.Bold else FontWeight.Light
                    )
                }
            )
        }
    }
}