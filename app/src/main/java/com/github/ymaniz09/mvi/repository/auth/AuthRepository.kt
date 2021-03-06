package com.github.ymaniz09.mvi.repository.auth

import com.github.ymaniz09.mvi.api.auth.OpenApiAuthService
import com.github.ymaniz09.mvi.persistence.AccountPropertiesDao
import com.github.ymaniz09.mvi.persistence.AuthTokenDao
import com.github.ymaniz09.mvi.session.SessionManager
import javax.inject.Inject

class AuthRepository
@Inject
constructor(
    val authTokenDao: AuthTokenDao,
    val accountPropertiesDao: AccountPropertiesDao,
    val openApiAuthService: OpenApiAuthService,
    val sessionManager: SessionManager
)