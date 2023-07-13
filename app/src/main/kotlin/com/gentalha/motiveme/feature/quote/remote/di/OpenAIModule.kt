package com.gentalha.motiveme.feature.quote.remote.di

import com.gentalha.motiveme.common.network.ServiceBuilder
import com.gentalha.motiveme.feature.quote.remote.service.OpenAIService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class OpenAIModule {

    @Provides
    @Singleton
    fun provideOpenAIService() =
        ServiceBuilder().invoke<OpenAIService>("https://api.openai.com")
}