package com.hybridge.my_pizza_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.hybridge.my_pizza_app.ui.PizzaViewModel
import com.hybridge.my_pizza_app.ui.theme.My_Pizza_AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            My_Pizza_AppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    PizzaScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun PizzaScreen(viewModel: PizzaViewModel = viewModel(), modifier: Modifier) {
    val pizza = viewModel.getPizzaOfTheDay()
    Box(modifier = Modifier.fillMaxSize().background(color = Color.LightGray),
        contentAlignment = Alignment.Center
    ){
        Text(text = "Pizza del dia: ${pizza.type} - ${pizza.size} - ${pizza.price}")
    }
}

@Composable
fun PizzaScreenContent(type: String, size: String, price: Double, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color.LightGray),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Pizza del dia: $type - $size - $price")
    }
}

@Preview(showBackground = true)
@Composable
fun PizzaScreenPreview() {
    My_Pizza_AppTheme {
        PizzaScreenContent(type = "Pepperoni", size = "Grande", price = 199.99)
    }
}