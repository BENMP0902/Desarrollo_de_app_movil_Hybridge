package com.hybridge.hello_world

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.hybridge.hello_world.ui.theme.Hello_WorldTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Arrangement

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Hello_WorldTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    HolaMundoApp(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun HolaMundoApp(modifier: Modifier = Modifier) {
    // Column apila elementos verticalmente
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Titular con tipografia grande
        Text(
            text = "Hola Mundo",
            style = MaterialTheme.typography.headlineLarge,
            color = MaterialTheme.colorScheme.primary
        )

        // Espaciado vertical entre componentes
        Spacer(modifier = Modifier.height(16.dp))

        // Subtitulo con tipografia media
        Text(
            text = "Mi primer app con Andriod y Jetpack Compose",
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.secondary
        )
    }
}

@Preview(showBackground = true)
@Composable
fun HolaMundoAppPreview() {
    Hello_WorldTheme {
        HolaMundoApp()
    }
}



