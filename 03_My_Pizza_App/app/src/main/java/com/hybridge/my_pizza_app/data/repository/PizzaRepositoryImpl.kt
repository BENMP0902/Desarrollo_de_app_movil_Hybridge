package com.hybridge.my_pizza_app.data.repository

import com.hybridge.my_pizza_app.domain.model.Pizza
import com.hybridge.my_pizza_app.domain.repository.PizzaRepository

class PizzaRepositoryImpl: PizzaRepository {
    override fun getPizzaOfTheDay(): Pizza {
        // Aqui deberia llegar la pizza desde la API o DB pero esta hardcodeada
        println("Obteniendo pizza desde el servidor...")
        return Pizza(type = "Pepperoni", size = "Grande", price = 180.00 )

    }
}