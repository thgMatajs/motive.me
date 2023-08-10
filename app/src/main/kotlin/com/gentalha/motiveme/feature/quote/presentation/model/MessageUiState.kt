package com.gentalha.motiveme.feature.quote.presentation.model

sealed class MessageUiState<out T> {
    class Success<T>(val data: T) : MessageUiState<T>()
    class Failure(val error: Throwable) : MessageUiState<Nothing>()

    object Loading : MessageUiState<Nothing>()

    object Empty : MessageUiState<Nothing>()
}