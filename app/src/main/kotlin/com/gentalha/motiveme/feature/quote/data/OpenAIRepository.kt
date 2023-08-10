package com.gentalha.motiveme.feature.quote.data

import com.gentalha.motiveme.feature.quote.cache.dao.QuoteDao
import com.gentalha.motiveme.feature.quote.cache.model.QuoteCacheModel
import com.gentalha.motiveme.feature.quote.presentation.model.QuoteModel
import com.gentalha.motiveme.feature.quote.remote.model.OpenAIPrompt
import com.gentalha.motiveme.feature.quote.remote.service.OpenAIService
import com.google.gson.Gson
import javax.inject.Inject

class OpenAIRepository @Inject constructor(
    private val service: OpenAIService,
    private val quoteDao: QuoteDao
) {

    suspend fun getMessage(messageType: String): Result<QuoteModel> {
        return service.getCompletions(OpenAIPrompt()).choices.first().runCatching {
            val quoteCache = Gson().fromJson(message.content, QuoteCacheModel::class.java)
            quoteDao.add(quoteCache)
            quoteDao.get().random().toModel()
        }
    }

    suspend fun update(quoteModel: QuoteModel) {
        kotlin.runCatching { quoteDao.update(quoteModel.toCache()) }
            .onSuccess { println("THG_LOG CACHE_UPDATE --> SUCCESS") }
            .onFailure { println("THG_LOG CACHE_UPDATE --> ERROR") }
    }

    suspend fun getFavorites(): Result<List<QuoteModel>> {
        return quoteDao.getFavorites()
            .runCatching { map { it.toModel() } }
            .onSuccess { println("THG_LOG CACHE_getFavorites --> SUCCESS") }
            .onFailure { error -> println("THG_LOG CACHE_getFavorites --> ERROR: ${error.message}") }
    }
}

fun QuoteCacheModel.toModel() =
    QuoteModel(this.id, this.message, this.author, this.hashtags, this.isFavorite)

fun QuoteModel.toCache() =
    QuoteCacheModel(this.id, this.message, this.author, this.hashtags, this.isFavorite)