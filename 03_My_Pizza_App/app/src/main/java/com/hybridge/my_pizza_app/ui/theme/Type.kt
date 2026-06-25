package com.hybridge.my_pizza_app.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// Typography agrupa los estilos de texto en una jerarquía nombrada (named hierarchy).
// Los Composables luego piden "dame el estilo titleLarge" en vez de tamaños sueltos.
val Typography = Typography(
    titleLarge = TextStyle(      // Títulos grandes (ej: encabezado de pantalla)
        fontSize = 28.sp,        // sp = scale-independent pixels: respeta el zoom de fuente del usuario
        fontWeight = FontWeight.Bold
    ),
    titleMedium = TextStyle(     // Subtítulos (ej: nombre de la pizza)
        fontSize = 22.sp,
        fontWeight = FontWeight.Medium
    ),
    bodyMedium = TextStyle(      // Cuerpo de texto (ej: precio, descripción)
        fontSize = 18.sp
    ),
    labelLarge = TextStyle(      // Etiquetas (ej: texto de botones)
        fontSize = 16.sp,
        fontWeight = FontWeight.Medium
    )
)