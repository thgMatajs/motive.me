package com.gentalha.motiveme.feature.quote.cache.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.gentalha.motiveme.feature.quote.cache.model.QuoteCacheModel

@Dao
interface QuoteDao {

    @Query("SELECT * FROM quotes")
    fun get(): List<QuoteCacheModel>

    @Query("SELECT * FROM quotes WHERE isFavorite = 1")
    fun getFavorites(): List<QuoteCacheModel>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun add(quote: QuoteCacheModel)

    @Update
    suspend fun update(quote: QuoteCacheModel)
}