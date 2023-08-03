package com.gentalha.motiveme.feature.quote.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gentalha.motiveme.feature.quote.cache.QuoteCache
import com.gentalha.motiveme.feature.quote.data.OpenAIRepository
import com.gentalha.motiveme.feature.quote.presentation.model.MessageUiState
import com.gentalha.motiveme.feature.quote.presentation.model.QuoteModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MessageViewModel @Inject constructor(
    private val repository: OpenAIRepository
) : ViewModel() {

    private val _uiState = MutableLiveData<MessageUiState>(MessageUiState.Empty)
    val uiState: LiveData<MessageUiState> get() = _uiState

    fun getMessage() {
        viewModelScope.launch(Dispatchers.IO) {
            _uiState.postValue(MessageUiState.Loading)
            runCatching { repository.getMessage("") }
                .onSuccess {
                    println("THG_LOG --> QUOTE: $it")
                    _uiState.postValue(MessageUiState.Success(it))
                }
                .onFailure {
                    println("THG_LOG --> ERRO: ${it.message}")
                    _uiState.postValue(
                        MessageUiState.Success(
                            QuoteCache.positiveMessages.random()
                        )
                    )
                }
        }
    }

    fun update(quote: QuoteModel) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.update(quote)
        }
    }
}