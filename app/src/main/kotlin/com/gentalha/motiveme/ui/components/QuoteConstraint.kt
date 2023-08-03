package com.gentalha.motiveme.ui.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Refresh
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.gentalha.motiveme.feature.quote.cache.QuoteCache
import com.gentalha.motiveme.feature.quote.presentation.model.QuoteModel
import com.gentalha.motiveme.ui.theme.Black

@Preview(showBackground = true)
@Composable
fun QuoteConstraint(
    quote: QuoteModel = QuoteCache.positiveMessages.random(),
    newQuoteClick: () -> Unit = {},
    favoriteOnClick: (Boolean) -> Unit = {},
    shareOnClick: (String) -> Unit = {},
    showSnack: Boolean = false,
    snackBarMessage: String = ""
) {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        var showSnackBar by remember { mutableStateOf(showSnack) }
        val (quoteCard, refreshBtn, snackBar) = createRefs()

        QuoteCard(
            modifier = Modifier.constrainAs(quoteCard) {
                top.linkTo(parent.top)
                start.linkTo(parent.start, margin = 16.dp)
                end.linkTo(parent.end, margin = 16.dp)
                bottom.linkTo(refreshBtn.top)
                width = Dimension.fillToConstraints
            },
            quote = quote,
            favoriteOnClick = (favoriteOnClick),
            sharedOnClick = (shareOnClick)
        )

        FloatingActionButton(
            onClick = { newQuoteClick() },
            modifier = Modifier.constrainAs(refreshBtn) {
                bottom.linkTo(if (showSnackBar) snackBar.top else parent.bottom, margin = 24.dp)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            }) {
            Icon(
                imageVector = Icons.Outlined.Refresh,
                tint = Black,
                contentDescription = "new quote"
            )
        }

        RetrySnackBar(
            message = snackBarMessage,
            isShow = showSnackBar,
            modifier = Modifier.constrainAs(snackBar) {
                bottom.linkTo(parent.bottom, margin = 16.dp)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            }
        ) {
            showSnackBar = !showSnackBar
        }
    }
}