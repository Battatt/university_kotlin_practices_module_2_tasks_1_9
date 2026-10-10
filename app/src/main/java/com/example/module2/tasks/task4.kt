package com.example.module2.tasks

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(
    showBackground = true,
)
@Composable
fun Task4ButtonScreen(
    modifier: Modifier = Modifier,
) {
    Button(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        border = BorderStroke(2.dp, Color.Gray),
        elevation = ButtonDefaults.buttonElevation(4.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.LightGray,
            contentColor = Color.Black,
        ),
        onClick = {},
    ) {
        Text(
            text = "Нажми на меня"
        )
        
    }
}