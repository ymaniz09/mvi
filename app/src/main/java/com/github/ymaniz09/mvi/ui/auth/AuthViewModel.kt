package com.github.ymaniz09.mvi.ui.auth

import androidx.lifecycle.ViewModel
import com.github.ymaniz09.mvi.repository.auth.AuthRepository
import javax.inject.Inject

class AuthViewModel
@Inject
constructor(
    val authRepository: AuthRepository
) : ViewModel()