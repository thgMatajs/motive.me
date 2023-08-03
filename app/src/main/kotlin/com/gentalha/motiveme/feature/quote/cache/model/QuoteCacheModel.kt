package com.gentalha.motiveme.feature.quote.cache.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "quotes")
data class QuoteCacheModel(
    @PrimaryKey(true) val id: Int,
    val message: String,
    val author: String,
    val hashtags: List<String>,
    val isFavorite: Boolean
)
