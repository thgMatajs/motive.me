package com.gentalha.motiveme.feature.quote.remote.model

data class OpenAIResponse(
    val id: String,
    val model: String,
    val choices: List<OpenAIChoice>
)
