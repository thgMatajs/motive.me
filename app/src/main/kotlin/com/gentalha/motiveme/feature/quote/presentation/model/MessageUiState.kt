package com.gentalha.motiveme.feature.quote.presentation.model

sealed class MessageUiState {
    class Success(val quote: QuoteModel) : MessageUiState()
    class Failure(val error: Throwable) : MessageUiState()

    object Loading : MessageUiState()

    object Empty : MessageUiState()
}