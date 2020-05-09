package com.github.ymaniz09.mvi.di.auth

import com.github.ymaniz09.mvi.api.auth.OpenApiAuthService
import com.github.ymaniz09.mvi.persistence.AccountPropertiesDao
import com.github.ymaniz09.mvi.persistence.AuthTokenDao
import com.github.ymaniz09.mvi.repository.auth.AuthRepository
import com.github.ymaniz09.mvi.session.SessionManager
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class AuthModule {

    @AuthScope
    @Provides
    fun provideOpenApiAuthService(retrofitBuilder: Retrofit.Builder): OpenApiAuthService {
        return retrofitBuilder
            .build()
            .create(OpenApiAuthService::class.java)
    }

    @AuthScope
    @Provides
    fun provideAuthRepository(
        sessionManager: SessionManager,
        authTokenDao: AuthTokenDao,
        accountPropertiesDao: AccountPropertiesDao,
        openApiAuthService: OpenApiAuthService
    ): AuthRepository {
        return AuthRepository(
            authTokenDao,
            accountPropertiesDao,
            openApiAuthService,
            sessionManager
        )
    }
}