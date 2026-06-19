package com.hybridge.my_pizza_app.ui

import androidx.lifecycle.ViewModel
import com.hybridge.my_pizza_app.data.repository.PizzaRepositoryImpl
import com.hybridge.my_pizza_app.domain.model.Pizza
import com.hybridge.my_pizza_app.domain.usecases.GetPizzasUseCase

class PizzaViewModel: ViewModel() {
    private val getPizzasUseCase = GetPizzasUseCase(PizzaRepositoryImpl())
    fun getPizzaOfTheDay(): Pizza = getPizzasUseCase.execute()
}