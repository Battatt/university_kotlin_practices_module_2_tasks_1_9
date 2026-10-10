package com.example.module2.tasks

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextIndent
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.module2.R

@Preview(
    showBackground = true,
    showSystemUi = true,
)
@Composable
fun TextPreview(
    modifier: Modifier = Modifier,
){
    Column(
        modifier = modifier.fillMaxSize().padding(8.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
    ) {
        Text(
            text = stringResource(R.string.task_3_text),
            color = Color.Green,
            fontSize = 16.sp,
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.Center
        )
        Text(
            text = stringResource(R.string.task_3_text),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        )
        Text(
            modifier = Modifier.background(color = Color.Green),
            text = stringResource(R.string.task_3_text),
            style = TextStyle(
                textIndent = TextIndent(
                    firstLine = 48.sp,
                ),
            ),
            textDecoration = TextDecoration.Underline,
            fontSize = 24.sp,
        )
    }
}