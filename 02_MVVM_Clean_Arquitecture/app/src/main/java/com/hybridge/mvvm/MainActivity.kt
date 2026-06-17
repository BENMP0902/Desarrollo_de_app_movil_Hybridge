package com.hybridge.mvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.hybridge.mvvm.ui.UserVierModel
import com.hybridge.mvvm.ui.theme.MVVMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MVVMTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MyScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun MyScreen(viewModel: UserVierModel = viewModel()){
    val user = viewModel.getUser()
    MyScreenContent(name = user.name)
}

@Composable
fun MyScreenContent(name: String, modifier: Modifier = Modifier) {
    Text(text = "Hola, $name", modifier = modifier)
}

@Preview(showBackground = true)
@Composable
fun MyScreenPreview() {
    MVVMTheme {
        MyScreenContent(name = "David")
    }
}