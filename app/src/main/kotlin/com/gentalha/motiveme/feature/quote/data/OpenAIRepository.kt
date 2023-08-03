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

    suspend fun getMessage(messageType: String): QuoteModel {
        return service.getCompletions(OpenAIPrompt()).choices.first().run {
            val json = text
            val quoteCache = Gson().fromJson(json, QuoteCacheModel::class.java)
            quoteDao.add(quoteCache)
            println("THG_LOG cache size: ${quoteDao.get().size}")
            quoteDao.get().random().toModel()
        }
    }

    suspend fun update(quoteModel: QuoteModel) {
        kotlin.runCatching { quoteDao.update(quoteModel.toCache()) }
            .onSuccess { println("THG_LOG CACHE_UPDATE --> SUCCESS") }
            .onFailure { println("THG_LOG CACHE_UPDATE --> ERROR") }
    }
}

fun QuoteCacheModel.toModel() =
    QuoteModel(this.id, this.message, this.author, listOf(), this.isFavorite)

fun QuoteModel.toCache() =
    QuoteCacheModel(this.id, this.message, this.author, this.isFavorite)