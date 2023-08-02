package com.gentalha.motiveme.feature.quote.remote.model

import com.google.gson.annotations.SerializedName

data class OpenAIPrompt(
    val prompt: String = "mensagem famosa aleatoria positiva com ate 150 caracteres respeitando a ortografia brasileira, em um objeto do tipo json, onde a messagem ficara no atributo message, o autor no atributo author, no atributo hashtags que sera um array list as 10 hashtags que essa frase mais se encaixa.",
    val model: String = "text-davinci-003",
    @SerializedName("max_tokens") val maxTokens: Int = 200,
    val n: Int = 1,
    val temperature: Double = 0.9
)
