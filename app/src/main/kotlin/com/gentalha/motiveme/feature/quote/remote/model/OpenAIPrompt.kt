package com.gentalha.motiveme.feature.quote.remote.model

data class OpenAIPrompt(
    val prompt: String = "Mensagem positiva com ate 150 caracteres",
    val model: String = "text-davinci-003",
    val max_tokens: Int = 150,
    val n: Int = 1,
    val temperature: Double = 0.9
)
