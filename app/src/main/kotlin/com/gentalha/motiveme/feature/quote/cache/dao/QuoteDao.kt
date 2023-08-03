package com.gentalha.motiveme.feature.quote.cache.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.gentalha.motiveme.feature.quote.cache.model.QuoteCacheModel

@Dao
interface QuoteDao {

    @Query("SELECT * FROM quotes")
    fun getQuotes(): List<QuoteCacheModel>

    @Query("SELECT * FROM quotes WHERE isFavorite = 1")
    fun getFavoriteQuotes(): List<QuoteCacheModel>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun add(quote: QuoteCacheModel)
}