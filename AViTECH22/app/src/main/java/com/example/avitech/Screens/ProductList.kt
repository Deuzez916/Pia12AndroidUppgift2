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

/*
@Composable
fun Dropdown(){
    val context = LocalContext.current
    val coffeeDrinks = arrayOf("Americano", "Cappuccino", "Espresso", "Latte", "Mocha")
    var expanded by remember { mutableStateOf(false) }
    var selectedText by remember { mutableStateOf(coffeeDrinks[0]) }

    Box(modifier = Modifier
        .fillMaxWidth()
        .padding(32.dp)
    ) {
        ExposedDropdownMenuBox(
            expanded = expanded,
            onExpandedChange = {
                expanded = !expanded
            }
        ) {
            TextField(
                value = selectedText,
                onValueChange = {},
                readOnly = true,
                trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded)},
                modifier = Modifier.menuAnchor()
            )

            ExposedDropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {
               coffeeDrinks.forEach { item ->
                   DropdownMenuItem(
                       text = { Text(text = item)},
                       onClick = {
                           selectedText = item
                           expanded = false
                           Toast.makeText(context, item, Toast.LENGTH_SHORT).show()
                       }
                   )
               }
            }
        }
    }
}
*/

@Composable
fun productList() {
    var activeIndex by remember { mutableStateOf(2) }
    var totalSteps = 6

    var productName by remember { mutableStateOf("") }
    var serialNumber by remember { mutableStateOf("") }
    var marking by remember { mutableStateOf("") }
    var article by remember { mutableStateOf("") }
    var peaces by remember { mutableStateOf("") }

    val buttonModifier = Modifier
        .fillMaxWidth(fraction = 0.7f)
        .height(75.dp)
        .padding(8.dp)

    val buttonModifier2 = Modifier
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

        Text("Apparatlista", color = Color.White)

        TextField(
            value = productName,
            onValueChange = { productName = it },
            label = { Text(text = "Produkt namn:") },
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier.padding(4.dp)
        )

        Row {
            // lägg till icon för scanning av streckkod

            TextField(
                value = serialNumber,
                onValueChange = { serialNumber = it },
                label = { Text(text = "Serienummer:") },
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier.padding(4.dp)
            )
        }

        TextField(
            value = marking,
            onValueChange = { serialNumber = it },
            label = { Text(text = "Märkning:") },
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier.padding(4.dp)
        )

        Button(onClick = {

        },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF9ABC41)),
            modifier = buttonModifier)
        {
            Text(text = "Lägg till")
        }

        Text(text = "Installatios material:", color = Color.White,)

        Row {
            TextField(
                value = article,
                onValueChange = { article = it},
                label = { Text(text = "Atikel:") },
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier.padding(4.dp)
            )

            // lägg till dropdown
        }

        Spacer(modifier = Modifier.weight(1f))

        Button(onClick = {
            //skapa navigerings logik här
        },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF9ABC41)),
            modifier = buttonModifier2
        ) {
            Text(text = "Nästa")
        }
    }
}