package com.gentalha.motiveme.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Snackbar
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gentalha.motiveme.R
import com.gentalha.motiveme.ui.theme.GreyBlack
import com.gentalha.motiveme.ui.theme.GreyLight

@Composable
fun RetrySnackBar(
    modifier: Modifier,
    message: String,
    isShow: Boolean = false,
    retryClick: () -> Unit
) {
    AnimatedVisibility(
        modifier = modifier,
        visible = isShow,
        enter = fadeIn(),
        exit = fadeOut()
    ) {
        Snackbar(
            modifier = Modifier
                .padding(8.dp),
            containerColor = GreyLight,
            action = {
                TextButton(
                    onClick = {
                        retryClick()
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent,
                        contentColor = Color.Gray
                    )
                ) {
                    Text(
                        text = stringResource(R.string.retry),
                        style = TextStyle(
                            color = GreyBlack,
                            fontWeight = FontWeight.Bold,
                        )
                    )
                }
            }
        ) {
            Text(
                text = message,
                style = TextStyle(
                    color = GreyBlack,
                    fontWeight = FontWeight.Medium,
                    fontSize = 15.sp
                )
            )
        }
    }
}