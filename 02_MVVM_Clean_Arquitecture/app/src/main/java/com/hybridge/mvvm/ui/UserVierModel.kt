package com.hybridge.mvvm.ui

import androidx.lifecycle.ViewModel
import com.hybridge.mvvm.data.UserRepository
import com.hybridge.mvvm.domain.models.User
import com.hybridge.mvvm.domain.usecase.GetUserUseCase

class UserVierModel: ViewModel() {
    private val getUserUseCase = GetUserUseCase(repository = UserRepository())
    fun getUser(): User = getUserUseCase.execute()
}
