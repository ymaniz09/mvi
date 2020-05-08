package com.github.ymaniz09.mvi.session

import android.app.Application
import com.github.ymaniz09.mvi.persistence.AuthTokenDao

class SessionManager
constructor(
    val authTokenDao: AuthTokenDao,
    val application: Application
)