package com.gentalha.motiveme.feature.quote.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gentalha.motiveme.feature.quote.data.OpenAIRepository
import com.gentalha.motiveme.feature.quote.presentation.model.MessageUiState
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
                    _uiState.postValue(MessageUiState.Success(it.choices.first().text))
                }
                .onFailure {
                    _uiState.postValue(MessageUiState.Failure(it))
                }
        }
    }
}