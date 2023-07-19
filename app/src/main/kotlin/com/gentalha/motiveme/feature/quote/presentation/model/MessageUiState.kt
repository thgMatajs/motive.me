package com.gentalha.motiveme.feature.quote.presentation.model

sealed class MessageUiState {
    class Success(val text: String) : MessageUiState()
    class Failure(val error: Throwable) : MessageUiState()

    object Loading : MessageUiState()

    object Empty : MessageUiState()
}