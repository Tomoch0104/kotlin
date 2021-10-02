package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            MessageCard("Anderoid")
        }
    }

    private fun setContent(function: () -> Unit) {

    }
}

@Composable
fun MessageCard(name: String){
    Text(text = "Hello $name")
}