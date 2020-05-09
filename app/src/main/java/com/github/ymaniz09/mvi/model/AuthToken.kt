package com.github.ymaniz09.mvi.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "auth_token",
    foreignKeys = [
        ForeignKey(
            entity = AccountProperties::class,
            parentColumns = ["pk"],
            childColumns = ["account_pk"],
            onDelete = ForeignKey.CASCADE
        )]
)
data class AuthToken(

    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "account_pk")
    val accountPk: Int? = -1,

    @SerializedName("token")
    @Expose
    @ColumnInfo(name = "token")
    val token: String? = null
)