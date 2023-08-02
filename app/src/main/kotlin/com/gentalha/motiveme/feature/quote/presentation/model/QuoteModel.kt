package com.gentalha.motiveme.feature.quote.presentation.model

import java.util.UUID

data class QuoteModel(
    val id: String = UUID.randomUUID().toString(),
    val message: String,
    val author: String = "",
    val hashtags: List<String> = listOf()
)
