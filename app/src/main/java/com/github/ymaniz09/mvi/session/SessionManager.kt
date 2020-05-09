package com.github.ymaniz09.mvi.session

import android.app.Application
import com.github.ymaniz09.mvi.persistence.AuthTokenDao
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SessionManager
@Inject
constructor(
    val authTokenDao: AuthTokenDao,
    val application: Application
)