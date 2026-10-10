package com.example.module2.tasks

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview

private const val DEFAULT_NAME = "Имя не задано"

// Task 1
@Composable
fun Hello(
    modifier: Modifier = Modifier,
    name: String?,
    ) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = name ?: DEFAULT_NAME,
            textAlign = TextAlign.Center
        )
    }
}

// Task 2
@Preview(
    device = Devices.TABLET,
    showBackground = true,
    showSystemUi = true,
)
@Composable
fun HelloPreviewLandscape() {
    Hello(
        name = DEFAULT_NAME,
    )
}

@Preview(
    device = Devices.PHONE,
    showBackground = true,
    showSystemUi = true,
)
@Composable
fun HelloPreviewPortrait() {
    Hello(
        name = DEFAULT_NAME,
    )
}

@Preview(
    device = "id:wearos_small_round",
    showBackground = true,
    showSystemUi = true,
)
@Composable
fun HelloPreviewRound() {
    Hello(
        name = DEFAULT_NAME,
    )
}
