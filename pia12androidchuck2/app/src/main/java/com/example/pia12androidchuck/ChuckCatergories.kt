package com.example.pia12androidchuck

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun ChuckCatergories(chuckVM : ChuckViewModel, goCatergory : () -> Unit) {
    Column {
        Text("CATEGORIES", modifier = Modifier.background(Color.White))

        Button(onClick = {
            goCatergory()
        }) {
            Text("CATEGORY")
        }
    }
}