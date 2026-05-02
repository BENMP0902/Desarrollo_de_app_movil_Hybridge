package com.hybridge.mvvm.ui

import com.hybridge.mvvm.data.UserRepository

class UserVierModel {
    private val userRepository = UserRepository()
    fun getUserName(): String = userRepository.getUserName()
}
