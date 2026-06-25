package com.hybridge.my_pizza_app.ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

val RedPizza = Color(0xFFD84315)
val CreamBackground = Color(0xFFFFF8E1)
val GreenHighlight = Color(0xFF388E3C)

val LightColors = lightColorScheme(
    primary = RedPizza,
    secondary = GreenHighlight,
    background = CreamBackground,
    onPrimary = Color.White,
    onBackground = Color.Black
)

// --- Variantes para modo oscuro (dark mode) ---
// Colores desaturados/claros para contrastar sobre fondo oscuro.
val DarkColors = darkColorScheme(
    primary = Color(0xFFFFAB91),
    secondary = Color(0xFFA5D6A7),
    background = Color(0xFF212121),
    onPrimary = Color.Black,
    onBackground = Color.White
)