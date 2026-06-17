package com.hybridge.mvvm.ui

import androidx.lifecycle.ViewModel
import com.hybridge.mvvm.data.UserRepository
import com.hybridge.mvvm.domain.models.User
import com.hybridge.mvvm.domain.usecase.GetEdadUseCase
import com.hybridge.mvvm.domain.usecase.GetUserUseCase

class UserViewModel: ViewModel() {
    private val getUserUseCase = GetUserUseCase(repository = UserRepository())
    private val getEdadUseCase = GetEdadUseCase(repository = UserRepository())  // NUEVO

    fun getUser(): User = getUserUseCase.execute()
    fun getEdad(): Int = getEdadUseCase.execute()    // NUEVO
}
