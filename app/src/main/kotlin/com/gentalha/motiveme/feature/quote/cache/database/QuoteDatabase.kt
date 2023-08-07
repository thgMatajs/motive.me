package com.gentalha.motiveme.feature.quote.cache.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.gentalha.motiveme.feature.quote.cache.dao.QuoteDao
import com.gentalha.motiveme.feature.quote.cache.model.HashtagConverter
import com.gentalha.motiveme.feature.quote.cache.model.QuoteCacheModel

@Database(entities = [QuoteCacheModel::class], version = 1)
@TypeConverters(HashtagConverter::class)
abstract class QuoteDatabase : RoomDatabase() {
    abstract fun quoteDao(): QuoteDao
}