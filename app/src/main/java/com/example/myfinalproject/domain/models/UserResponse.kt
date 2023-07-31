package com.example.myfinalproject.domain.models

import com.google.gson.annotations.SerializedName

data class UserResponse(
    @SerializedName("objectId") val objectId:String,
    @SerializedName("sessionToken") val sessionToken:Int,
)
