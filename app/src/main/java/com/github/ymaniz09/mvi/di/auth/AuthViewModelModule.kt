package com.github.ymaniz09.mvi.di.auth

import androidx.lifecycle.ViewModel
import com.github.ymaniz09.mvi.di.ViewModelKey
import com.github.ymaniz09.mvi.ui.auth.AuthViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class AuthViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel::class)
    abstract fun bindAuthViewModel(authViewModel: AuthViewModel): ViewModel
}