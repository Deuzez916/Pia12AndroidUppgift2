package com.example.pia12androidfeb15

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun Shoprow(shop : Shopthing) {

    Row (modifier = Modifier
        .background(Color.White)
    ){
        Text(shop.shoptitle, modifier = Modifier
            .background(Color.Cyan), fontSize = 20.sp
        )
    }
}

@Preview
@Composable
fun shoprowPreview() {
    Shoprow("Mjölk")
}