package com.github.ymaniz09.mvi.api.auth.network_responses

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class RegistrationResponse(

    @SerializedName("response")
    @Expose
    var response: String,

    @SerializedName("error_message")
    @Expose
    var errorMessage: String,

    @SerializedName("email")
    @Expose
    var email: String,

    @SerializedName("username")
    @Expose
    var username: String,

    @SerializedName("pk")
    @Expose
    var pk: Int,

    @SerializedName("token")
    @Expose
    var token: String
)