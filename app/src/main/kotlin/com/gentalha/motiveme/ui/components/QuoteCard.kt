package com.gentalha.motiveme.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gentalha.motiveme.ui.theme.Black
import com.gentalha.motiveme.ui.theme.GreyNeutral
import com.gentalha.motiveme.ui.theme.Lemon
import com.gentalha.motiveme.ui.theme.LilacLight
import com.gentalha.motiveme.ui.theme.Pink80

@Composable
fun QuoteCard(text: String, modifier: Modifier) {
    val backgroundColors = listOf(Lemon, LilacLight, Pink80)
    Card(
        modifier = modifier
            .padding(8.dp, 8.dp)
            .background(Black),
        colors = CardDefaults.cardColors(
            containerColor = backgroundColors.random()
        )
    ) {
        Text(
            text = "\" \n \n $text \n \n \"",
            style = TextStyle(
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic,
                fontSize = 18.sp,
                color = GreyNeutral,
                lineHeight = 30.sp
            ),
            textAlign = TextAlign.Start,
            modifier = modifier.padding(all = 24.dp),
        )
    }
}