package com.example.weatherappcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.weatherappcompose.screens.MainScreen
import com.example.weatherappcompose.ui.theme.WeatherAppComposeTheme

const val API_KEY = "0570ad2fb7e546ec815183456232407"

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherAppComposeTheme {
                MainScreen()
            }
        }
    }
}
