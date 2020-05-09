package com.github.ymaniz09.mvi.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Entity(tableName = "account_properties")
data class AccountProperties(
    @SerializedName("pk")
    @Expose
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "pk")
    val pk: Int,

    @SerializedName("email")
    @Expose
    @ColumnInfo(name = "email")
    val email: String,

    @SerializedName("username")
    @Expose
    @ColumnInfo(name = "username")
    val username: String
)