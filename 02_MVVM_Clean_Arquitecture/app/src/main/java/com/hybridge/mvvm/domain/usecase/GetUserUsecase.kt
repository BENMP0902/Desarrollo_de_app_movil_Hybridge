package com.hybridge.mvvm.domain.usecase

import com.hybridge.mvvm.data.UserRepository
import com.hybridge.mvvm.domain.models.User

class GetUserUseCase(private val repository: UserRepository)  {
    fun execute(): User = User(name = "El Bicho")
}