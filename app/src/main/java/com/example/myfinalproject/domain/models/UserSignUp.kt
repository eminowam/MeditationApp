package com.example.myfinalproject.domain.models

import com.google.gson.annotations.SerializedName

data class UserSignUp(
    @SerializedName("username") val userName: String,
    @SerializedName("password") val password: String,
    @SerializedName("email") val email: String,
    @SerializedName("phoneNumber") val phoneNumber: String,
)