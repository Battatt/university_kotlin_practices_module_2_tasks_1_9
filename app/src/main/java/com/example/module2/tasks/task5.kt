package com.example.module2.tasks

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(
    showBackground = true,
)
@Composable
fun Task5(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(Color.Gray),
        contentAlignment = Alignment.Center,
    ) {
        Box(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxHeight()
                .aspectRatio(1f)
                .clip(CircleShape)
                .background(Color(0xFFFF9800)),
            contentAlignment = Alignment.Center,
        ) {
            Text(
                text = "ББ"
            )
        }
    }
}