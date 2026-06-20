package com.hybridge.my_pizza_app.domain.usecases

import com.hybridge.my_pizza_app.domain.model.Pizza
import com.hybridge.my_pizza_app.domain.repository.PizzaRepository

class GetPizzasUseCase(private val repository: PizzaRepository) {
    fun execute(): Pizza {
        val pizza = repository.getPizzaOfTheDay()
        val discount = pizza.price * 0.9
        return pizza.copy(price = discount)
    }
}