package com.hybridge.my_pizza_app.domain.model

data class Pizza(
    val type: String,      // Nombre/tipo: "Pepperoni"
    val size: String,      // Tamaño: "grande"  <- CAMPO NUEVO
    val price: Double,     // Precio base
    val imageRes: Int      // ID del recurso de imagen (R.drawable.*)
)