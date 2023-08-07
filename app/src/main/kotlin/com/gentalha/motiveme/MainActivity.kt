package com.gentalha.motiveme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.gentalha.motiveme.feature.quote.presentation.viewmodel.MessageViewModel
import com.gentalha.motiveme.ui.screens.QuoteScreen
import com.gentalha.motiveme.ui.theme.MotiveMeTheme
import com.google.android.gms.ads.MobileAds
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val viewModel: MessageViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MobileAds.initialize(this)
            MotiveMeTheme {
                QuoteScreen(viewModel = viewModel)
            }
        }
    }
}