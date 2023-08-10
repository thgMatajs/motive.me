package com.gentalha.motiveme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.gentalha.motiveme.feature.quote.presentation.viewmodel.MessageViewModel
import com.gentalha.motiveme.navigation.BottomNavHost
import com.gentalha.motiveme.ui.components.BannerAd
import com.gentalha.motiveme.ui.components.BottomNavigationBar
import com.gentalha.motiveme.ui.theme.Black
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
                val navController = rememberNavController()
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Black
                ) {
                    Scaffold(
                        topBar = {
                            BannerAd(
                                modifier = Modifier.fillMaxWidth(),
                                adId = "ca-app-pub-3940256099942544/6300978111"
                            )
                        },
                        bottomBar = { BottomNavigationBar(navController) }
                    ) {
                        BottomNavHost(navController = navController, viewModel = viewModel)
                        it.calculateBottomPadding()
                    }
                }

            }
        }
    }
}