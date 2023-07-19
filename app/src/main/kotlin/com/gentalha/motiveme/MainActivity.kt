package com.gentalha.motiveme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gentalha.motiveme.feature.quote.presentation.model.MessageUiState
import com.gentalha.motiveme.feature.quote.presentation.viewmodel.MessageViewModel
import com.gentalha.motiveme.ui.theme.MotiveMeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val viewModel: MessageViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MotiveMeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting(viewModel)
                }
            }
        }
    }
}

@Composable
fun Greeting(viewModel: MessageViewModel, modifier: Modifier = Modifier) {
    val message by viewModel.uiState.observeAsState()

    LaunchedEffect(Unit) {
        viewModel.getMessage()
    }

    message?.apply {
        when (message) {
            is MessageUiState.Loading -> LoadingScreen(modifier = modifier)
            is MessageUiState.Success -> {
                TextScreen((message as MessageUiState.Success).text, modifier)

            }

            is MessageUiState.Failure -> {
                TextScreen(
                    "ERRO: ${(message as MessageUiState.Failure).error.localizedMessage}",
                    modifier
                )
            }

            else -> {

            }
        }
    }

}

@Composable
fun LoadingScreen(message: String = "Loading...", modifier: Modifier) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            CircularProgressIndicator()
            Text(
                text = message,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(all = 8.dp),
            )
        }
    }
}

@Composable
fun TextScreen(text: String, modifier: Modifier) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(8.dp, 8.dp),
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = text,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(all = 8.dp),
        )
    }
}

@Composable
fun Quote(message: String, modifier: Modifier = Modifier) {
    Text(
        text = message,
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MotiveMeTheme {

    }
}