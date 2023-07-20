package com.gentalha.motiveme.ui.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Refresh
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.gentalha.motiveme.feature.quote.cache.QuoteCache
import com.gentalha.motiveme.ui.theme.Black

@Preview(showBackground = true)
@Composable
fun QuoteConstraint(
    quote: String = QuoteCache.frasesPositivas.random(),
    newQuoteClick: () -> Unit = {}
) {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (quoteCard, refreshBtn) = createRefs()

        QuoteCard(text = quote, modifier = Modifier.constrainAs(quoteCard) {
            top.linkTo(parent.top)
            start.linkTo(parent.start, margin = 16.dp)
            end.linkTo(parent.end, margin = 16.dp)
            bottom.linkTo(parent.bottom)
            width = Dimension.fillToConstraints
        })

        FloatingActionButton(
            onClick = { newQuoteClick.invoke() },
            modifier = Modifier.constrainAs(refreshBtn) {
                bottom.linkTo(parent.bottom, margin = 24.dp)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            }) {
            Icon(
                imageVector = Icons.Outlined.Refresh,
                tint = Black,
                contentDescription = "new quote"
            )
        }
    }
}