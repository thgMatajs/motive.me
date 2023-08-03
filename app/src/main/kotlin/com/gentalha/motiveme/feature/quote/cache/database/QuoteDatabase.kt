package com.gentalha.motiveme.feature.quote.cache.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.gentalha.motiveme.feature.quote.cache.dao.QuoteDao
import com.gentalha.motiveme.feature.quote.cache.model.QuoteCacheModel

@Database(entities = [QuoteCacheModel::class], version = 1)
abstract class QuoteDatabase : RoomDatabase() {
    abstract fun quoteDao(): QuoteDao
}