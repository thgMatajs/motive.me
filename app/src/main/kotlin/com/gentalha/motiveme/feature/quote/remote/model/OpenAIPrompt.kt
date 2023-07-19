package com.gentalha.motiveme.feature.quote.remote.model

data class OpenAIPrompt(
    val prompt: String = "mensagem positiva com ate 150 caracteres removendo todos os caracters \n \n",
    val model: String = "text-davinci-003",
    val max_tokens: Int = 150,
    val n: Int = 1,
    val temperature: Double = 0.9
)
