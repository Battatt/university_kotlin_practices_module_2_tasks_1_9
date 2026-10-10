package com.example.module2.tasks

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.module2.R

@Preview(
    showBackground = true,
)
@Composable
fun Task6First(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .size(
                width = 240.dp,
                height = 120.dp
            )
            .background(Color.Black)
        ,
        contentAlignment = Alignment.TopEnd,
    ) {
        Image(
            painter = painterResource(R.drawable.circle),
            contentDescription = "Orange circle"
        )
    }
}

@Preview(
    showBackground = true,
)
@Composable
fun Task6Second(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .size(
                width = 240.dp,
                height = 120.dp
            )
            .background(Color.Blue)
        ,
        contentAlignment = Alignment.TopEnd,
    ) {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(R.drawable.circle),
            colorFilter = ColorFilter.tint(Color(0xFF8B00FF)),
            contentScale = ContentScale.FillBounds,
            contentDescription = "Orange circle",
        )
    }
}