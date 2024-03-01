package com.example.avitech.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.avitech.reusable.ProgressIndicator
import com.example.avitech.reusable.logo

@Composable
fun StartScreen(
    goInstallationInfo : () -> Unit
) {
    var activeIndex by remember { mutableStateOf(0) }
    var totalSteps = 6

    val buttonModifier = Modifier
        .fillMaxWidth(fraction = 0.8f)
        .height(75.dp)
        .padding(horizontal = 16.dp)

    val buttonColor = ButtonDefaults.buttonColors(containerColor = Color(0xFF9ABC41))

    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF485258)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        logo()

        ProgressIndicator(
            activeIndex = activeIndex,
            totalSteps = totalSteps
        )

        Spacer(modifier = Modifier.weight(1f))

        Box (contentAlignment = Alignment.Center) {
            Column {
                Button (
                    onClick = { if (activeIndex < totalSteps - 1) activeIndex++ },
                    colors = buttonColor,
                    modifier = buttonModifier
                ) {
                    Text("Ny Installation")
                }

                Spacer(modifier = Modifier.height(50.dp))

                Button(onClick = {
                    goInstallationInfo()
                }) {
                    Text(text = "Arkiv Ny")
                }

                Button(onClick = { if (activeIndex > 0) activeIndex--},
                    colors = buttonColor,
                    modifier = buttonModifier
                ) {
                    Text("Arkiv")
                }
            }
        }

        Spacer(modifier = Modifier.weight(1f))
    }
}