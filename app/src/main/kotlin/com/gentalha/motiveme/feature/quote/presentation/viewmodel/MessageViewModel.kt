package com.gentalha.motiveme.feature.quote.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gentalha.motiveme.feature.quote.data.OpenAIRepository
import com.gentalha.motiveme.feature.quote.presentation.model.MessageUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MessageViewModel @Inject constructor(
    private val repository: OpenAIRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(MessageUiState(""))
    val uiState: StateFlow<MessageUiState> = _uiState.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            println("THG_LOG _______________")
            val message = repository.getMessage("").body()?.choices?.first()?.text
            println("THG_LOG _______________ $message")
            _uiState.update {
                it.copy(message = message ?: "erro view model")
            }
        }
    }

    fun getMessage(): Flow<Result<String>> = flow {
        runCatching { repository.getMessage("") }
            .onSuccess {
                it.run {
                    if (isSuccessful) {
                        emit(
                            Result.success(body()?.choices?.first()?.text ?: "")
                        )
                    } else {
                        emit(Result.success("Mensagem local"))
                    }
                }
            }
            .onFailure {
                Result.failure<Exception>(it)
            }
    }
}