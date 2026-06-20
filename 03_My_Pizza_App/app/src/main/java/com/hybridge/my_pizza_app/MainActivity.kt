package com.hybridge.my_pizza_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.hybridge.my_pizza_app.ui.PizzaScreen
import com.hybridge.my_pizza_app.ui.theme.My_Pizza_AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            My_Pizza_AppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val pad = innerPadding
                    PizzaScreen()
                }
            }
        }
    }
}