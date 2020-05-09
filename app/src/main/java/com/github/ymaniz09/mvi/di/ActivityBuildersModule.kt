package com.github.ymaniz09.mvi.di

import com.github.ymaniz09.mvi.di.auth.AuthFragmentBuildersModule
import com.github.ymaniz09.mvi.di.auth.AuthModule
import com.github.ymaniz09.mvi.di.auth.AuthScope
import com.github.ymaniz09.mvi.di.auth.AuthViewModelModule
import com.github.ymaniz09.mvi.ui.auth.AuthActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {

    @AuthScope
    @ContributesAndroidInjector(
        modules = [AuthModule::class, AuthFragmentBuildersModule::class, AuthViewModelModule::class]
    )
    abstract fun contributeAuthActivity(): AuthActivity
}