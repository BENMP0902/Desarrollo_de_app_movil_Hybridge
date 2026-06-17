package com.hybridge.mvvm.domain.usecase

import com.hybridge.mvvm.data.UserRepository
import com.hybridge.mvvm.domain.models.User

class GetUserUseCase(private val repository: UserRepository) {
    fun execute(): User = User(
        name = repository.getUserName(),
        edad = repository.getUserAge()    // Esto lo agregaremos al Repository en un momento
    )
}