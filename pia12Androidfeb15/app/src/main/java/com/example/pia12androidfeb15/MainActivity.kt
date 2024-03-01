package com.example.pia12androidfeb15

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pia12androidfeb15.ui.theme.Pia12Androidfeb15Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Pia12Androidfeb15Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Shopping()
                }
            }
        }
    }
}

@Composable
fun Shopping() {

    //var shopitems = mutableListOf<String>("Apelsin", "Banan")

    var addname by remember {
        mutableStateOf("Hej")
    }

    var addamount by remember {
        mutableStateOf("Hejsan")
    }

    var shopitems = remember {
        mutableStateListOf<Shopthing>()
    }

    Column {
        Column(
            modifier = Modifier
                .height(100.dp)
                .fillMaxWidth()
                .background(Color.Red))
        {

            Row (modifier = Modifier
                .height(200.dp)
                .fillMaxWidth()
                .background(Color.Red))
            {

                TextField(value = addname, onValueChange = {
                    addname = it
                }, modifier = Modifier.width(30.dp))

                TextField(value = addamount, onValueChange = {
                    addamount = it
                }, modifier = Modifier.width(30.dp))
            }

            Button(onClick = {
                addamount.toIntOrNull()?.let {amountnumber ->
                    var tempshop() = Shopthing(addname, amountnumber)
                    shopitems.add(tempshop)
                }
                shopitems.add(Shopthing("Mjölk", 1))
            }) {
                Text("Add")
            }
        }

        LazyColumn {

            items(shopitems) { shopitem ->
                Shoprow()
            }

            items(500) { index ->
                Text("Item: $index")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Pia12Androidfeb15Theme {
        Shopping()
    }
}