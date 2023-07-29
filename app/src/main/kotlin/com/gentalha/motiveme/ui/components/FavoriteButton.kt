package com.gentalha.motiveme.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.IconToggleButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.gentalha.motiveme.ui.theme.GreyBlack

@Composable
fun FavoriteButton(
    isFavorite: Boolean = false,
    modifier: Modifier,
    onClick: (Boolean) -> Unit
) {
    var hasFavorite by remember { mutableStateOf(isFavorite) }

    IconToggleButton(
        modifier = modifier,
        checked = hasFavorite,
        onCheckedChange = {
            hasFavorite = !hasFavorite
            onClick(hasFavorite)
        }
    ) {
        Icon(
            imageVector = if (hasFavorite) Icons.Filled.Favorite else Icons.Default.FavoriteBorder,
            tint = GreyBlack,
            contentDescription = "favorite icon"
        )
    }
}