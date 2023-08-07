package com.gentalha.motiveme.feature.quote.remote.model

data class OpenAIPrompt(
    val messages: List<OpenAIMessage> = listOf(
        OpenAIMessage(
            "user",
            "mensagem famosa aleatoria positiva com ate 150 caracteres respeitando a ortografia brasileira, em um json, onde a messagem ficara no atributo message, o autor no atributo author, no atributo hashtags que sera um array list as 10 hashtags que essa frase mais se encaixa."
        )
    ),
    val model: String = "gpt-3.5-turbo"
)

data class OpenAIMessage(
    val role: String,
    val content: String
)
