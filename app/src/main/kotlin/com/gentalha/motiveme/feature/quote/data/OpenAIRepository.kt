package com.gentalha.motiveme.feature.quote.data

import com.gentalha.motiveme.feature.quote.cache.dao.QuoteDao
import com.gentalha.motiveme.feature.quote.remote.model.OpenAIPrompt
import com.gentalha.motiveme.feature.quote.remote.model.OpenAIResponse
import com.gentalha.motiveme.feature.quote.remote.service.OpenAIService
import javax.inject.Inject

class OpenAIRepository @Inject constructor(
    private val service: OpenAIService,
    private val quoteDao: QuoteDao
) {

    suspend fun getMessage(messageType: String): OpenAIResponse = service.getCompletions(OpenAIPrompt())
}