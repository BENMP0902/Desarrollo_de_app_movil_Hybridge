package com.hybridge.my_pizza_app.domain.usecases

import com.hybridge.my_pizza_app.domain.model.Pizza
import com.hybridge.my_pizza_app.domain.repository.PizzaRepository

class GetAllPizzasUseCase(private val repository: PizzaRepository) {
    fun execute(): List<Pizza> = repository.getAllPizzas()
}