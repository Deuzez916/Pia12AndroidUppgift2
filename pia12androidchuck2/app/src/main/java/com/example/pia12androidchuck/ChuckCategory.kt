package com.example.pia12androidchuck

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ChuckCategory(chuckVM : ChuckViewModel) {
    Column {
        Text("CATEGORY", modifier = Modifier.background(Color.White))
    }
}

@Preview
@Composable
fun ChuckCategoryPreview() {
    ChuckCategory(ChuckViewModel())
}