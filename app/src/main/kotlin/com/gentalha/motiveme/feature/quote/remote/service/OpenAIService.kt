package com.gentalha.motiveme.feature.quote.remote.service

import com.gentalha.motiveme.feature.quote.remote.model.OpenAIPrompt
import com.gentalha.motiveme.feature.quote.remote.model.OpenAIResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface OpenAIService {

    @POST("v1/chat/completions")
    suspend fun getCompletions(@Body prompt: OpenAIPrompt): OpenAIResponse
}