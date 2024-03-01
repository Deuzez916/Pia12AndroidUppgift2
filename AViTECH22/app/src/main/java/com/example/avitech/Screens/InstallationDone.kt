package com.example.avitech.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
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
fun installationDone() {
    var activeIndex by remember { mutableStateOf(4) }
    var totalSteps = 6

    val checkedState = remember { mutableStateOf( true ) }

    val buttonModifier = Modifier
        .fillMaxWidth(fraction = 1f)
        .height(75.dp)
        .padding(horizontal = 16.dp)

    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF485258))
            .padding(horizontal = 16.dp, vertical = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        logo()

        ProgressIndicator(
            activeIndex = activeIndex,
            totalSteps = totalSteps
        )

        Text("Färdig installation?", color = Color.White)

        Row (modifier = Modifier
            .background(Color.White),
            verticalAlignment = Alignment.CenterVertically,
        )
        {
            Text("Är installationen helt slutförd:")

            Checkbox(
                checked = checkedState.value,
                onCheckedChange = { checkedState.value = it}
            )
        }

        // lägg till funktion om checkbox = false (kolla figma)

        // lägg till de bilder som har blivit tagna under arbetet

        Spacer(modifier = Modifier.weight(1f))

        Button(onClick = {
            //skapa navigerings logik här
        },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF9ABC41)),
            modifier = buttonModifier
        ) {
            Text(text = "Nästa")
        }
    }
}