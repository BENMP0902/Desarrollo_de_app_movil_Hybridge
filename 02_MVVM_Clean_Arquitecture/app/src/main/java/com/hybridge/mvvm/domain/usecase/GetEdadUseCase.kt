package com.hybridge.mvvm.domain.usecase

import com.hybridge.mvvm.data.UserRepository

class GetEdadUseCase(private val repository: UserRepository) {
    fun execute(): Int = repository.getUserAge()
}