package com.gentalha.motiveme.feature.quote.presentation.model

data class QuoteModel(
    val id: Int,
    val message: String,
    val author: String = "",
    val hashtags: List<String> = listOf(),
    val isFavorite: Boolean
)
