package com.github.ymaniz09.mvi.persistence

import androidx.room.Database
import androidx.room.RoomDatabase
import com.github.ymaniz09.mvi.model.AccountProperties
import com.github.ymaniz09.mvi.model.AuthToken

@Database(entities = [AuthToken::class, AccountProperties::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun getAuthTokenDao(): AuthTokenDao
    abstract fun getAccountPropertiesDao(): AccountPropertiesDao

    companion object {
        const val DATABASE_NAME = "app_db"
    }
}