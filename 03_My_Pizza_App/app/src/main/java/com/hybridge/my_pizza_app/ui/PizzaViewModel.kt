package com.hybridge.my_pizza_app.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.hybridge.my_pizza_app.data.repository.PizzaRepositoryImpl
import com.hybridge.my_pizza_app.domain.model.Pizza
import com.hybridge.my_pizza_app.domain.usecases.GetPizzaOfDayUseCase

class PizzaViewModel: ViewModel() {
    private val getPizzasUseCase = GetPizzaOfDayUseCase(PizzaRepositoryImpl())
    var  pizzaState by mutableStateOf(getPizzasUseCase.execute())
    fun refreshPizza() {
        pizzaState = getPizzasUseCase.execute()
    }

}

