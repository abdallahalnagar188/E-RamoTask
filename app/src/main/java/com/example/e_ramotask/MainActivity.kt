package com.example.e_ramotask

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.example.e_ramotask.navigation.MainScreenView
import com.example.e_ramotask.ui.theme.ERamoTaskTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ERamoTaskTheme {
                val navController = rememberNavController()
                MainScreenView(navController =navController )
            }
        }
    }
}
