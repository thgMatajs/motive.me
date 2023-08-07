package com.gentalha.motiveme.feature.quote.cache.di

import android.content.Context
import androidx.room.Room
import com.gentalha.motiveme.feature.quote.cache.dao.QuoteDao
import com.gentalha.motiveme.feature.quote.cache.database.QuoteDatabase
import com.gentalha.motiveme.feature.quote.cache.model.HashtagConverter
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object CacheModule {

    @Provides
    @Singleton
    fun provideQuoteDatabase(@ApplicationContext context: Context): QuoteDatabase {
        return Room.databaseBuilder(context, QuoteDatabase::class.java, "quotes-db")
            .addTypeConverter(HashtagConverter())
            .build()
    }

    @Provides
    fun provideQuoteDao(database: QuoteDatabase): QuoteDao {
        return database.quoteDao()
    }
}