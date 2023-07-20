package com.gentalha.motiveme.ui.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.gentalha.motiveme.feature.quote.cache.QuoteCache

@Preview(showBackground = true)
@Composable
fun QuoteConstraint(quote: String = QuoteCache.frasesPositivas.random()) {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (quoteCard, refreshBtn) = createRefs()

        QuoteCard(text = quote, modifier = Modifier.constrainAs(quoteCard) {
            top.linkTo(parent.top)
            start.linkTo(parent.start, margin = 16.dp)
            end.linkTo(parent.end, margin = 16.dp)
            bottom.linkTo(parent.bottom)
            width = Dimension.fillToConstraints
        })

        IconButton(onClick = { /*TODO*/ }, modifier = Modifier.constrainAs(refreshBtn) {

        }) {

        }
    }
}