package com.gentalha.motiveme.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import androidx.constraintlayout.compose.ConstraintLayout
import com.gentalha.motiveme.feature.quote.cache.QuoteCache
import com.gentalha.motiveme.feature.quote.presentation.model.QuoteModel
import com.gentalha.motiveme.ui.theme.Black
import com.gentalha.motiveme.ui.theme.GreyBlack
import com.gentalha.motiveme.ui.theme.GreyNeutral
import com.gentalha.motiveme.ui.theme.Lemon
import com.gentalha.motiveme.ui.theme.LilacLight
import com.gentalha.motiveme.ui.theme.Pink80

@Composable
fun QuoteCard(
    modifier: Modifier = Modifier,
    quote: QuoteModel = QuoteCache.positiveMessages.random(),
    favoriteOnClick: (Boolean) -> Unit,
    sharedOnClick: (String) -> Unit
) {
    val backgroundColors = listOf(Lemon, LilacLight, Pink80)
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp, 8.dp)
            .background(Black),
        colors = CardDefaults.cardColors(
            containerColor = backgroundColors.random()
        )
    ) {
        ConstraintLayout(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            val (quoteText, favoriteBtn, shareBtn) = createRefs()
            Text(
                text = "\" \n ${quote.message} \n \"",
                style = TextStyle(
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Italic,
                    fontSize = 16.sp,
                    color = GreyNeutral,
                    lineHeight = 30.sp
                ),
                textAlign = TextAlign.Start,
                modifier = Modifier
                    .constrainAs(quoteText) {
                        top.linkTo(parent.top, margin = 16.dp)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                        bottom.linkTo(favoriteBtn.top, margin = 16.dp)
                    }
            )
            FavoriteButton(
                modifier = Modifier.constrainAs(favoriteBtn) {
                    bottom.linkTo(parent.bottom)
                    start.linkTo(quoteText.start)
                },
                onClick = { favoriteOnClick(it) },
                isFavorite = quote.isFavorite
            )

            IconButton(
                modifier = Modifier.constrainAs(shareBtn) {
                    end.linkTo(quoteText.end)
                    bottom.linkTo(favoriteBtn.bottom)
                },
                onClick = { sharedOnClick(quote.message) }) {
                Icon(
                    imageVector = Icons.Default.Share,
                    contentDescription = "shared button",
                    tint = GreyBlack
                )
            }
        }
    }
}