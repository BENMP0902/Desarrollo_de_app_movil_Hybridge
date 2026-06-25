package com.hybridge.my_pizza_app.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.hybridge.my_pizza_app.data.repository.PizzaRepositoryImpl
import com.hybridge.my_pizza_app.domain.model.Pizza
import com.hybridge.my_pizza_app.domain.usecases.GetAllPizzasUseCase
import com.hybridge.my_pizza_app.domain.usecases.GetPizzaOfDayUseCase

class PizzaViewModel: ViewModel() {
    // Caso de uso para pizza del dia
    private val getPizzasUseCase = GetPizzaOfDayUseCase(PizzaRepositoryImpl())

    // Caso de uso para obtener listado de pizzas
    private val getAllPizzasUseCase = GetAllPizzasUseCase(PizzaRepositoryImpl())
    var  pizzaState by mutableStateOf(getPizzasUseCase.execute())
        private set //

    var pizzaList by mutableStateOf(getAllPizzasUseCase.execute())
        private set
    fun refreshPizza() {
        pizzaState = getPizzasUseCase.execute()
    }

    fun refreshPizzaList() {
        pizzaList = getAllPizzasUseCase.execute()
    }

}

