package com.hybridge.my_pizza_app.data.repository

import com.hybridge.my_pizza_app.R
import com.hybridge.my_pizza_app.domain.model.Pizza
import com.hybridge.my_pizza_app.domain.repository.PizzaRepository

class PizzaRepositoryImpl : PizzaRepository {
    private val pizzas = listOf(
        Pizza("Pepperoni", "grande", 180.0, R.drawable.pepperoni),
        Pizza("Hawaiana","grande", 160.0, R.drawable.hawaiana),
        Pizza("Mexicana", "grande", 190.0, R.drawable.mexicana),
        Pizza("Pepperoni", "grande", 180.0, R.drawable.pepperoni),
        Pizza("Hawaiana", "grande", 160.0, R.drawable.hawaiana),
        Pizza("Mexicana", "grande", 190.0, R.drawable.mexicana),
        Pizza("Pepperoni", "grande", 180.0, R.drawable.pepperoni),
        Pizza("Hawaiana", "grande", 160.0, R.drawable.hawaiana),
        Pizza("Mexicana", "grande", 190.0, R.drawable.mexicana)
    )
    private var lastPizza: Pizza? = null //variable que guarda la pizza en memoria

    // Asegura aleatoriedad
    override fun getPizzaOfTheDay(): Pizza {
        var pizza: Pizza
        do {
            pizza = pizzas.random()
        } while (pizza == lastPizza && pizzas.size > 1)
        return pizza
    }

    // Obtendra la lista del repository
    override fun getAllPizzas(): List<Pizza> = pizzas
}