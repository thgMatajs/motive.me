package com.gentalha.motiveme.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.platform.LocalContext
import com.gentalha.motiveme.common.extensions.sharedMessage
import com.gentalha.motiveme.feature.quote.presentation.model.MessageUiState
import com.gentalha.motiveme.feature.quote.presentation.model.QuoteModel
import com.gentalha.motiveme.feature.quote.presentation.viewmodel.MessageViewModel
import com.gentalha.motiveme.ui.components.CircularLoading
import com.gentalha.motiveme.ui.components.QuoteConstraint

@Composable
fun QuoteScreen(viewModel: MessageViewModel) {
    val message by viewModel.uiState.observeAsState()
    val context = LocalContext.current

    LaunchedEffect(Unit) {
        viewModel.getMessage()
    }

    message?.apply {
        when (message) {
            is MessageUiState.Loading -> CircularLoading()
            is MessageUiState.Success<*> -> {
                val quote = (message as MessageUiState.Success<QuoteModel>).data
                QuoteConstraint(
                    quote,
                    shareOnClick = { context.sharedMessage(it) },
                    newQuoteClick = { viewModel.getMessage() },
                    favoriteOnClick = { viewModel.update(quote.copy(isFavorite = it)) }
                )
            }

            is MessageUiState.Failure -> {
                QuoteConstraint(
                    snackBarMessage = "ERRO: ${(message as MessageUiState.Failure).error.localizedMessage}",
                    showSnack = true
                )
            }

            else -> {

            }
        }
    }
}