package com.gentalha.motiveme.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.gentalha.motiveme.feature.quote.presentation.model.MessageUiState
import com.gentalha.motiveme.feature.quote.presentation.model.QuoteModel
import com.gentalha.motiveme.feature.quote.presentation.viewmodel.MessageViewModel
import com.gentalha.motiveme.ui.components.CircularLoading
import com.gentalha.motiveme.ui.components.QuoteCard

@Composable
fun FavoriteScreen(viewModel: MessageViewModel) {

    val quotes by viewModel.favoriteUiState.observeAsState()

    LaunchedEffect(Unit) {
        viewModel.getFavorites()
    }
    quotes?.let {
        when (it) {
            is MessageUiState.Loading -> {
                CircularLoading()
            }

            is MessageUiState.Success<List<QuoteModel>> -> {
                LazyColumn(modifier = Modifier.padding(horizontal = 16.dp, vertical = 80.dp)) {
                    items(it.data, key = { key -> key.id }) { quote ->
                        QuoteCard(quote = quote, favoriteOnClick = { favorite ->
                            viewModel.update(quote.copy(isFavorite = favorite))
                        }, sharedOnClick = {})
                    }
                }
            }

            is MessageUiState.Failure -> {
                Box(modifier = Modifier.fillMaxSize()) {
                    Text(
                        text = it.error.message ?: "ALGO DEU ERRADO",
                        modifier = Modifier.align(Alignment.Center),
                        color = Color.White
                    )
                }
            }

            is MessageUiState.Empty -> {
                Box(modifier = Modifier.fillMaxSize()) {
                    Text(
                        text = "Lista vazia",
                        modifier = Modifier.align(Alignment.Center),
                        color = Color.White
                    )
                }
            }
        }
    }
}