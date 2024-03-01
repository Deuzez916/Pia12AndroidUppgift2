package com.example.avitech.reusable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.avitech2.R

@Composable
fun logo() {
    Image (
        painter = painterResource(
            id = R.drawable.logo
        ),
        contentDescription = null,
        modifier = Modifier
            .size(width = 300.dp, height = 200.dp)
            .padding(top = 32.dp)
    )
}