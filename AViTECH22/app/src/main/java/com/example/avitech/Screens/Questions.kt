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
fun questions() {
    var activeIndex by remember { mutableStateOf(3) }
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

        Text("Frågor", color = Color.White)

        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            // 1
            Row (modifier = Modifier
                .background(Color.White),
                verticalAlignment = Alignment.CenterVertically,
            )
            {
                Text("Har funktionstest utförts:")

                Checkbox(
                    checked = checkedState.value,
                    onCheckedChange = { checkedState.value = it}
                )
            }

            // 2
            Row (modifier = Modifier
                .background(Color.White),
                verticalAlignment = Alignment.CenterVertically,
            )
            {
                Text("Har kablar och ansl. Märkts med nummer/namn:")

                Checkbox(
                    checked = checkedState.value,
                    onCheckedChange = { checkedState.value = it}
                )
            }

            // 3
            Row (modifier = Modifier
                .background(Color.White),
                verticalAlignment = Alignment.CenterVertically,
            )
            {
                Text("Har apparater märkts:")

                Checkbox(
                    checked = checkedState.value,
                    onCheckedChange = { checkedState.value = it}
                )
            }

            // 4
            Row (modifier = Modifier
                .background(Color.White),
                verticalAlignment = Alignment.CenterVertically,
            )
            {
                Text("Har installationen dokumenterats med foton:")

                Checkbox(
                    checked = checkedState.value,
                    onCheckedChange = { checkedState.value = it}
                )
            }

            // 5
            Row (modifier = Modifier
                .background(Color.White),
                verticalAlignment = Alignment.CenterVertically,
            )
            {
                Text("Är synliga kablar dolda i kabelkanal/kabelstrumpa:")

                Checkbox(
                    checked = checkedState.value,
                    onCheckedChange = { checkedState.value = it}
                )
            }

            // 6
            Row (modifier = Modifier
                .background(Color.White),
                verticalAlignment = Alignment.CenterVertically,
            )
            {
                Text("Är kablar dragavlastade:")

                Checkbox(
                    checked = checkedState.value,
                    onCheckedChange = { checkedState.value = it}
                )
            }

            // 7
            Row (modifier = Modifier
                .background(Color.White),
                verticalAlignment = Alignment.CenterVertically,
            )
            {
                Text("Slutförd installation har fotats:")

                Checkbox(
                    checked = checkedState.value,
                    onCheckedChange = { checkedState.value = it}
                )
            }

            // 8
            Row (modifier = Modifier
                .background(Color.White),
                verticalAlignment = Alignment.CenterVertically,
            )
            {
                Text("Kund har fått en genomgång av systemet:")

                Checkbox(
                    checked = checkedState.value,
                    onCheckedChange = { checkedState.value = it}
                )
            }
        }

        // lägg till funktion om checkbox = false frö en kommentar under

        Text("ÄTA-arbete", color = Color.White)

        Row {
            // 1
            Row (modifier = Modifier
                .background(Color.White),
                verticalAlignment = Alignment.CenterVertically,
            )
            {
                Text("Har funktionstest utförts:")

                Checkbox(
                    checked = checkedState.value,
                    onCheckedChange = { checkedState.value = it}
                )
            }
        }

        // lägg till funktion om checkbox = false (kolla figma)

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