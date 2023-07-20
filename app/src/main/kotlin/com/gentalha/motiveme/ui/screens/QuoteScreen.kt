package com.gentalha.motiveme.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import com.gentalha.motiveme.feature.quote.presentation.model.MessageUiState
import com.gentalha.motiveme.feature.quote.presentation.viewmodel.MessageViewModel
import com.gentalha.motiveme.ui.components.CircularLoading
import com.gentalha.motiveme.ui.components.QuoteConstraint

@Composable
fun QuoteScreen(viewModel: MessageViewModel, modifier: Modifier = Modifier) {
    val message by viewModel.uiState.observeAsState()

    LaunchedEffect(Unit) {
        viewModel.getMessage()
    }

    message?.apply {
        when (message) {
            is MessageUiState.Loading -> CircularLoading(modifier = modifier)
            is MessageUiState.Success -> {
                QuoteConstraint(
                    (message as MessageUiState.Success).text
                ) { viewModel.getMessage() }
            }

            is MessageUiState.Failure -> {
                QuoteConstraint(
                    "ERRO: ${(message as MessageUiState.Failure).error.localizedMessage}"
                ) { viewModel.getMessage() }
            }

            else -> {

            }
        }
    }
}