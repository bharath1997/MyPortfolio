package com.bharath.portfolio

import App
import BatteryManager
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            App(batteryManager = remember { BatteryManager(applicationContext) })
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    App(batteryManager = BatteryManager(LocalContext.current))
}