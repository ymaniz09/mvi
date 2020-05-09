package com.github.ymaniz09.mvi.di.auth

import com.github.ymaniz09.mvi.ui.auth.ForgotPasswordFragment
import com.github.ymaniz09.mvi.ui.auth.LauncherFragment
import com.github.ymaniz09.mvi.ui.auth.LoginFragment
import com.github.ymaniz09.mvi.ui.auth.RegisterFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class AuthFragmentBuildersModule {

    @ContributesAndroidInjector()
    abstract fun contributeLauncherFragment(): LauncherFragment

    @ContributesAndroidInjector()
    abstract fun contributeLoginFragment(): LoginFragment

    @ContributesAndroidInjector()
    abstract fun contributeRegisterFragment(): RegisterFragment

    @ContributesAndroidInjector()
    abstract fun contributeForgotPasswordFragment(): ForgotPasswordFragment
}