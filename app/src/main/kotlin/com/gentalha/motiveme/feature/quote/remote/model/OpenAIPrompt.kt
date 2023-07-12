package com.gentalha.motiveme.feature.quote.remote.model

data class OpenAIPrompt(
    val prompt: String,
    val model: String = "text-davinci-003",
    val max_tokens: Int = 300,
    val n: Int = 1,
    val temperature: Double = 0.9
)
