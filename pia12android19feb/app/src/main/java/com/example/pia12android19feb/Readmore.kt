package com.example.pia12android19feb

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Readmore(stuffVM : StuffViewModel, fruit : String, goFancy : () -> Unit) {
    Column {
        Text("Read more $fruit", modifier = Modifier.background(Color.White))

        Text(stuffVM.sometext)

        Button(onClick = {
            goFancy()
        }) {
            Text("Fancy")
        }
    }
}

@Preview
@Composable
fun ReadmorePreview() {
    Readmore(StuffViewModel(), "ABC", goFancy = {})
}