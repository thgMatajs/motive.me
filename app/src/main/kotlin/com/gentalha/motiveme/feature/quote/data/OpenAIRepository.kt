package com.gentalha.motiveme.feature.quote.data

import com.gentalha.motiveme.feature.quote.remote.model.OpenAIPrompt
import com.gentalha.motiveme.feature.quote.remote.service.OpenAIService
import javax.inject.Inject

class OpenAIRepository @Inject constructor(
    private val service: OpenAIService
) {

    suspend fun getMessage(messageType: String) = service.getCompletions(OpenAIPrompt())
}