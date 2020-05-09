package com.github.ymaniz09.mvi.di

import androidx.lifecycle.ViewModelProvider
import com.github.ymaniz09.mvi.viewmodels.ViewModelProviderFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelFactoryModule {

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelProviderFactory): ViewModelProvider.Factory
}