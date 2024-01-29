package com.example.pia12androidintro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var minsiffra = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mintext = findViewById<TextView>(R.id.fancytext)
        mintext.text = "Apelsin"

        var minknapp = findViewById<Button>(R.id.fancyButton)
        minknapp.setOnClickListener {

            minsiffra = minsiffra + 1

            mintext.text = minsiffra.toString()
        }
    }
}