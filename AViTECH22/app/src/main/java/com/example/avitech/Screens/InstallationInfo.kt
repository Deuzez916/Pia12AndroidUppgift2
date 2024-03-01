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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
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
fun installationInfo(

) {
    var activeIndex by remember { mutableStateOf(1) }
    var totalSteps = 6

    // lägg till data
    var date by remember { mutableStateOf("") }
    var projectNumber by remember { mutableStateOf("") }
    var projectName by remember { mutableStateOf("") }
    var room by remember { mutableStateOf("") }
    var installerName by remember { mutableStateOf("") }

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

        Text (text = "Installations information:", color = Color.White)

        TextField (
            value = date,
            onValueChange = {date = it},
            label = { Text(text = "Datum:") },
            shape = RoundedCornerShape(topStart = 8.dp, topEnd = 8.dp)
        )
        TextField(
            value = projectNumber,
            onValueChange = {projectNumber = it},
            label = { Text(text = "Projektnummer:") },
            shape = RoundedCornerShape(0.dp)
        )
        TextField(value = projectName,
            onValueChange = {projectName = it},
            label = { Text(text = "Projektnamn:") },
            shape = RoundedCornerShape(0.dp)
        )
        TextField(
            value = room,
            onValueChange = {room = it},
            label = { Text(text = "Rum:") },
            shape = RoundedCornerShape(bottomStart = 8.dp, bottomEnd = 8.dp)
        )

        Spacer(modifier = Modifier.height(24.dp))

        Text(text = "Installation utförd av:", color = Color.White)

        Row (
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            TextField(
                value = installerName,
                onValueChange = { installerName = it },
                label = { Text(text = "Namn:") },
                modifier = Modifier
                    .weight(0.7f),
                shape = RoundedCornerShape(topStart = 8.dp, bottomStart = 8.dp)
            )

            Button(onClick = {
                //skapa logik
            },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF9ABC41)),
                modifier = Modifier
                    .weight(0.3f)
                    .height(56.dp),
                shape = RoundedCornerShape(topEnd = 8.dp, bottomEnd = 8.dp)
            ) {
                Text(text = "Lägg till")
            }
        }

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