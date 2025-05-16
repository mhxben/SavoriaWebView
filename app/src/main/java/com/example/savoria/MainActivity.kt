package com.example.savoria

import android.os.Bundle
import androidx.activity.*
import androidx.activity.compose.setContent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WebViewScreen("https://savoria.onrender.com/")
        }
    }
}