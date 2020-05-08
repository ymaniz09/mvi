package com.github.ymaniz09.mvi.ui.auth

import androidx.lifecycle.ViewModel
import com.github.ymaniz09.mvi.repository.auth.AuthRepository

class AuthViewModel
constructor(
    val authRepository: AuthRepository
) : ViewModel()