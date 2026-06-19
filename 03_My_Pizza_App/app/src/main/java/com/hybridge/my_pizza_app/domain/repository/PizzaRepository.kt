package com.hybridge.my_pizza_app.domain.repository

import com.hybridge.my_pizza_app.domain.model.Pizza

interface PizzaRepository {
    fun getPizzaOfTheDay(): Pizza
}