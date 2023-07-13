package com.gentalha.motiveme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gentalha.motiveme.feature.quote.presentation.viewmodel.MessageViewModel
import com.gentalha.motiveme.ui.theme.MotivemeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val viewModel: MessageViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MotivemeTheme {
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
//    val message by viewModel.getMessage().collectAsState(initial = null)
    val message by viewModel.uiState.collectAsState()
    Text(
        text = message.message,
        modifier = modifier
    )
//    message?.onSuccess {
//        Text(
//            text = it,
//            modifier = modifier
//        )
//    }?.onFailure {
//        Text(
//            text = "ERROR: ${it.message}",
//            modifier = modifier
//        )
//    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MotivemeTheme {

    }
}